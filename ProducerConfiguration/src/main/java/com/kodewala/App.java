package com.kodewala;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class App 
{
    public static void main( String[] args )
    {
        //Set kafka Configuration (Bootstrap server, key & value serializers)
    	Properties props = new Properties();
    	props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
    	props.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    	props.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    	
    	//create producer
    	KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);
    	
    	//create message
    	for(int i=0; i<100000; i++) {
    		ProducerRecord<String, String> record = new ProducerRecord<String, String>("view-product" , 
    				"Samasung S26 " + i);
    		producer.send(record);
    	}
    	
    	producer.close();
    	System.out.println("your message got successfully produced");
    }
}
