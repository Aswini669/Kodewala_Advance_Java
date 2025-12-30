package com.kodewala;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class App 
{
    public static void main( String[] args )
    {
    	//Set Kafka Configuration (Bootstrap server, Key & Value serializers)
        Properties prop = new Properties();
        prop.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        prop.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "my-group-1");
        prop.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        prop.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        
        //create cosumer Kafka
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(prop);
        
        //subscrbe the topic
        consumer.subscribe(Collections.singletonList("order"));
        
        //poll the topic
        while(true) {
        	ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));
        	
        	for(ConsumerRecord<?, ?> record: records) {
        		System.out.println("message offset: " + record.offset());
        		System.out.println("message key: " + record.key());
        		System.out.println("message value: " + record.value());
        	}
        }
    }
}
