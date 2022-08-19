package com.asyncapi.service;

import com.asyncapi.model.ServiceNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.asyncapi.model.PatchServiceRequestPayload;
import com.asyncapi.model.CreateServiceRequestPayload;
    

@Service
public class PublisherService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
 
    /**
     * This operation updates partially a Service entity.
     */
    public void patchServiceRequest(String key, PatchServiceRequestPayload patchServiceRequestPayload) {
        Message<PatchServiceRequestPayload> message = MessageBuilder.withPayload(patchServiceRequestPayload)
                .setHeader(KafkaHeaders.TOPIC, "TMF638.patchService.in")
                //.setHeader(KafkaHeaders.TOPIC, "TMF638.patchService.TMFC007.out")
                .setHeader(KafkaHeaders.MESSAGE_KEY, key)
                .build();
        kafkaTemplate.send(message);
    } 
    /**
     * This operation creates a Service entity.
     */
    public void createServiceRequest(String key, CreateServiceRequestPayload createServiceRequestPayload) {
        Message<CreateServiceRequestPayload> message = MessageBuilder.withPayload(createServiceRequestPayload)
                .setHeader(KafkaHeaders.TOPIC, "TMF638.createService.in")
                //.setHeader(KafkaHeaders.TOPIC, "TMF638.createService.TMFC007.out")
                .setHeader(KafkaHeaders.MESSAGE_KEY, key)
                .build();
        kafkaTemplate.send(message);
    } 
    
    public void serviceNotification(String key, ServiceNotification serviceNotificationPayload) {
        Message<ServiceNotification> message = MessageBuilder.withPayload(serviceNotificationPayload)
                .setHeader(KafkaHeaders.TOPIC, "TMF638.service.notification")
                .setHeader(KafkaHeaders.MESSAGE_KEY, key)
                .build();
        kafkaTemplate.send(message);
    }
}
