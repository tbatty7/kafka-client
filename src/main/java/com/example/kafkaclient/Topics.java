package com.example.kafkaclient;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Topics {

    String OUTPUT = "sampleOutput";

    @Input(Topics.OUTPUT)
    MessageChannel output();

    // Url to helpful link explaining how this class works
    // https://docs.spring.io/spring-cloud-stream/docs/Elmhurst.RELEASE/reference/htmlsingle/#spring-cloud-stream-preface-adding-message-handler

    // Url to link on how old version of kafka streams worked with binders - This class is a binder
    // https://docs.spring.io/spring-cloud-stream/docs/current/reference/html/_apache_kafka_streams_binder.html

    // Url of example project using kafka streams
    // https://github.com/spring-cloud/spring-cloud-stream-samples/blob/master/kafka-streams-samples/kafka-streams-message-channel/src/main/java/kafka/streams/message/channel/KafkaStreamsWordCountApplication.java
}
