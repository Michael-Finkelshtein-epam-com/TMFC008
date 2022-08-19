package com.asyncapi.service;

import com.asyncapi.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


@Service
public class ReplyPublisherService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
 
    /**
     * This operation updates partially a Service entity.
     */
    public void patchServiceResponse(String key, PatchServiceResponse patchServiceResponse) {
        Message<PatchServiceResponse> message = MessageBuilder.withPayload(patchServiceResponse)
                .setHeader(KafkaHeaders.TOPIC, "TMF638.patchService.TMFC007.out")
                .setHeader(KafkaHeaders.MESSAGE_KEY, key)
                .build();
        kafkaTemplate.send(message);
    } 
    /**
     * This operation creates a Service entity.
     */
    public void createServiceResponse(String key, CreateServiceResponse createServiceResponse) {
        Message<CreateServiceResponse> message = MessageBuilder.withPayload(createServiceResponse)
                .setHeader(KafkaHeaders.TOPIC, "TMF638.createService.TMFC007.out")
                .setHeader(KafkaHeaders.MESSAGE_KEY, key)
                .build();
        kafkaTemplate.send(message);
    }
}
