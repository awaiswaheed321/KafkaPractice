package com.awais.kafkaexample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "${kafka.topic.name}", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener: " + data + " :)");
    }
}
