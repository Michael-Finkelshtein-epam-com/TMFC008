package com.asyncapi.service;

import com.asyncapi.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class MessageHandlerService {

    @Autowired
    ReplyPublisherService replyPublisherService;
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageHandlerService.class);

    //@KafkaListener(topics = "TMF638.patchService.TMFC007.out", properties = {"com.asyncapi.model.PatchServiceResponsePayload"})
    @KafkaListener(topics = "TMF638.patchService.in", properties = {"com.asyncapi.model.PatchServiceRequestPayload"})
    public void patchServiceResponse(@Payload PatchServiceRequestPayload payload,
                       @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
                       @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
                       @Header(KafkaHeaders.RECEIVED_TIMESTAMP) long timestamp) {
        LOGGER.info("Key: " + key + ", Payload: " + payload.toString() + ", Timestamp: " + timestamp + ", Partition: " + partition);

        if (payload instanceof PatchServiceRequestPayload) {
            LOGGER.info("PatchServiceRequestPayload - preparing response");
            /*PatchServiceRequestPayload patchServiceRequestPayload = new PatchServiceRequestPayload();
            ServiceUpdate serviceUpdate = patchServiceRequestPayload.getBody();
            PatchServiceRequestPayloadParameters parameters = patchServiceRequestPayload.getParameters();
            parameters.setId("feasibilityChecked");*/

            PatchServiceResponse patchServiceResponse = new PatchServiceResponse();
            replyPublisherService.patchServiceResponse("patchKey", patchServiceResponse);
            LOGGER.info("patchServiceResponse published");
        }

    }
    
    //@KafkaListener(topics = "TMF638.createService.TMFC007.out", properties = {"com.asyncapi.model.CreateServiceResponsePayload"})
    @KafkaListener(topics = "TMF638.createService.in", properties = {"com.asyncapi.model.CreateServiceRequestPayload"})
    public void createServiceResponse(@Payload CreateServiceRequestPayload payload,
                       @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
                       @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
                       @Header(KafkaHeaders.RECEIVED_TIMESTAMP) long timestamp) {
        LOGGER.info("Key: " + key + ", Payload: " + payload.toString() + ", Timestamp: " + timestamp + ", Partition: " + partition);

        if (payload instanceof CreateServiceRequestPayload) {
            LOGGER.info("preparing response");

            CreateServiceResponse createServiceResponse = new CreateServiceResponse();
            replyPublisherService.createServiceResponse("crteateServiceKey", createServiceResponse);
            LOGGER.info("createServiceResponse published");
        }

    }
    
    

}
