package com.kodewala;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class App {

    public static void main(String[] args) {

        // Step 1: Create Properties object to hold Kafka producer configurations
        Properties props = new Properties();

        // Kafka broker address (where Kafka is running)
        props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

        // Serializer for message key (String -> bytes)
        props.setProperty(
                ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                StringSerializer.class.getName()
        );

        // Serializer for message value (String -> bytes)
        props.setProperty(
                ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                StringSerializer.class.getName()
        );

        // Step 2: Create Kafka Producer using the above configurations
        KafkaProducer<String, String> producer = new KafkaProducer<>(props);

        // Step 3: Create and send messages to Kafka topic
        for (int i = 0; i < 100; i++) {

            // Create a ProducerRecord
            // Topic name   : order
            // Key          : ord2 + i (used for partitioning)
            // Value        : actual message data
            ProducerRecord<String, String> record =
                    new ProducerRecord<>("order", "ord2" + i,
                            "Test ORDEEEEEEEEEEEEE" + i);

            // Send the message asynchronously to Kafka
            producer.send(record);
        }

        // Step 4: Close the producer (flushes pending messages and releases resources)
        producer.close();

        // Confirmation message
        System.out.println("Messages sent to Kafka successfully");
    }
}
