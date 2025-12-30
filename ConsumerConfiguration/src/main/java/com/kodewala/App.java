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
        Properties props = new Properties();
        props.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "group-9");
        props.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        
        //create consumer
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
        
        consumer.subscribe(Collections.singletonList("view-product"));
        
        while(true) {
        	ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));
        	for(ConsumerRecord record: records) {
        		System.out.println("offset : " + record.offset());
        		System.out.println("key : " + record.key());
        		System.out.println("value : " + record.value());
        	}
        }
        
    }
}
