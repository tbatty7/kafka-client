package com.example.kafkaclient;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(Topics.class)
public class Consumer {

    @StreamListener(Topics.OUTPUT)
    public void streamHandle(String message) {
        System.out.println(message);
    }
}
