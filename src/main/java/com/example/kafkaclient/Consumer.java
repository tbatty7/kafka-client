package com.example.kafkaclient;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(MessageChannels.class)
public class Consumer {

    @StreamListener(MessageChannels.MESSAGE_CHANNEL_FOR_TOPIC)
    public void streamHandle(String message) {
        System.out.println(message);
    }
}
