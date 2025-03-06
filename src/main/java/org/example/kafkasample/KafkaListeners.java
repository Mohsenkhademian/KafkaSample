package org.example.kafkasample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "topic1", groupId = "groupId")
    void listen(String data) {
        System.out.println("Listening: " + data);
    }
}
