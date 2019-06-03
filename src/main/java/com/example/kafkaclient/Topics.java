package com.example.kafkaclient;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface Topics {

    String OUTPUT = "sampleOutput";

    @Input(Topics.OUTPUT)
    MessageChannel output();
}
