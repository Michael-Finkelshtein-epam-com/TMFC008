package com.asyncapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.asyncapi.model.PatchServiceRequestPayload;
import com.asyncapi.model.ServiceUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.util.Random;

@Component
public class CommandLinePublisher implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(CommandLinePublisher.class);
    @Autowired
    PublisherService publisherService;

    @Override
    public void run(String... args) {
        System.out.println("******* Sending message: *******");

        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        PatchServiceRequestPayload patchServiceRequestPayload = new PatchServiceRequestPayload();
        ServiceUpdate body = new ServiceUpdate();
        body.setCategory("ServiceCategory");
        patchServiceRequestPayload.setBody(body);

        publisherService.patchServiceRequest(generatedString, patchServiceRequestPayload);
        logger.info("patchServiceRequest published: " + patchServiceRequestPayload.toString());
            
        publisherService.createServiceRequest(generatedString, new com.asyncapi.model.CreateServiceRequestPayload());
            
        publisherService.serviceNotification(generatedString, new com.asyncapi.model.ServiceNotification());
            
        System.out.println("Message sent");
    }
}
