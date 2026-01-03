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
        //set Kafka Configuration. (Host name, k & v serialization)
    	Properties prop = new Properties();
    	
    	prop.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
    	prop.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    	prop.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    	
    	//create producer (and pass the configuration)
    	KafkaProducer<String, String> producer = new KafkaProducer<String, String>(prop);
    	
    	//create message
    	for(int i=0; i<500; i++) {
    		ProducerRecord<String, String> record = new ProducerRecord<String, String>("sale","oppo k31" + i);
    		//send the message
    		producer.send(record);
    	}
    	
    	producer.close();
    	System.out.println("msg sent to Kafka");
    }
}
