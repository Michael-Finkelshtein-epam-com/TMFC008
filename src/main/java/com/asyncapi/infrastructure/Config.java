package com.asyncapi.infrastructure;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.common.config.SaslConfigs;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.*;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableKafka
public class Config {

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    @Value("${spring.kafka.consumer.group-id}")
    private String groupId;

    @Value("${spring.kafka.listener.poll-timeout}")
    private long pollTimeout;

    @Value("${spring.kafka.listener.concurrency}")
    private int concurrency;
    @Bean
    public KafkaTemplate<String, Object> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

    @Bean
    public ProducerFactory<String, Object> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public Map<String, Object> producerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "PLAINTEXT");
        props.put(JsonSerializer.TYPE_MAPPINGS,
        "CorrelationHeader:com.asyncapi.model.CorrelationHeader," +
        
        "PatchServiceRequestPayload:com.asyncapi.model.PatchServiceRequestPayload," +
        
        "ServiceUpdate:com.asyncapi.model.ServiceUpdate," +
        
        "Feature:com.asyncapi.model.Feature," +
        
        "ConstraintRef:com.asyncapi.model.ConstraintRef," +
        
        "Characteristic:com.asyncapi.model.Characteristic," +
        
        "CharacteristicRelationship:com.asyncapi.model.CharacteristicRelationship," +
        
        "FeatureRelationship:com.asyncapi.model.FeatureRelationship," +
        
        "Note:com.asyncapi.model.Note," +
        
        "RelatedPlaceRefOrValue:com.asyncapi.model.RelatedPlaceRefOrValue," +
        
        "RelatedEntityRefOrValue:com.asyncapi.model.RelatedEntityRefOrValue," +
        
        "RelatedParty:com.asyncapi.model.RelatedParty," +
        
        "RelatedServiceOrderItem:com.asyncapi.model.RelatedServiceOrderItem," +
        
        "ServiceRelationship:com.asyncapi.model.ServiceRelationship," +
        
        "ServiceRefOrValue:com.asyncapi.model.ServiceRefOrValue," +
        
        "ResourceRef:com.asyncapi.model.ResourceRef," +
        
        "PatchServiceUpdated:com.asyncapi.model.PatchServiceUpdated," +
        
        "BadRequestResponse:com.asyncapi.model.BadRequestResponse," +
        
        "Error:com.asyncapi.model.Error," +
        
        "UnauthorizedResponse:com.asyncapi.model.UnauthorizedResponse," +
        
        "ForbiddenResponse:com.asyncapi.model.ForbiddenResponse," +
        
        "NotFoundResponse:com.asyncapi.model.NotFoundResponse," +
        
        "MethodNotAllowedResponse:com.asyncapi.model.MethodNotAllowedResponse," +
        
        "ConflictResponse:com.asyncapi.model.ConflictResponse," +
        
        "InternalServerErrorResponse:com.asyncapi.model.InternalServerErrorResponse," +
        
        "CreateServiceRequestPayload:com.asyncapi.model.CreateServiceRequestPayload," +
        
        "ServiceCreate:com.asyncapi.model.ServiceCreate," +
        
        "CreateServiceCreated:com.asyncapi.model.CreateServiceCreated," +
        
        "ServiceBaseEvent:com.asyncapi.model.ServiceBaseEvent," +
        
        "ServiceBasePlusEvent:com.asyncapi.model.ServiceBasePlusEvent," +
        
        "RetrieveServiceRequestPayload:com.asyncapi.model.RetrieveServiceRequestPayload," +
        
        "RetrieveServiceSuccess:com.asyncapi.model.RetrieveServiceSuccess," +
        
        "ListServiceRequestPayload:com.asyncapi.model.ListServiceRequestPayload," +
        
        "ListServiceSuccess:com.asyncapi.model.ListServiceSuccess," +
        
        "DeleteServiceRequestPayload:com.asyncapi.model.DeleteServiceRequestPayload," +
        
        "DeleteServiceDeleted:com.asyncapi.model.DeleteServiceDeleted," +
        
        "Place:com.asyncapi.model.Place," +
        
        "PlaceRef:com.asyncapi.model.PlaceRef," +
        
        "EntityRef:com.asyncapi.model.EntityRef," +
        
        "Extensible:com.asyncapi.model.Extensible," +
        
        "Entity:com.asyncapi.model.Entity," +
        
        "ReferredType:com.asyncapi.model.ReferredType," +
        
        "ServiceRef:com.asyncapi.model.ServiceRef," +
        
        "Addressable:com.asyncapi.model.Addressable," +
        
        "EntityValue:com.asyncapi.model.EntityValue," +
        
        "TimePeriod:com.asyncapi.model.TimePeriod"
        );
        // See https://kafka.apache.org/documentation/#producerconfigs for more properties
        return props;
    }

    @Bean
    KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, Object>>
    kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, Object> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        factory.setConcurrency(concurrency);
        factory.getContainerProperties().setPollTimeout(pollTimeout);
        return factory;
    }

    @Bean
    public ConsumerFactory<String, Object> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public Map<String, Object> consumerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "PLAINTEXT");props.put(JsonDeserializer.TYPE_MAPPINGS,
        "CorrelationHeader:com.asyncapi.model.CorrelationHeader," +
        
        "PatchServiceRequestPayload:com.asyncapi.model.PatchServiceRequestPayload," +
        
        "ServiceUpdate:com.asyncapi.model.ServiceUpdate," +
        
        "Feature:com.asyncapi.model.Feature," +
        
        "ConstraintRef:com.asyncapi.model.ConstraintRef," +
        
        "Characteristic:com.asyncapi.model.Characteristic," +
        
        "CharacteristicRelationship:com.asyncapi.model.CharacteristicRelationship," +
        
        "FeatureRelationship:com.asyncapi.model.FeatureRelationship," +
        
        "Note:com.asyncapi.model.Note," +
        
        "RelatedPlaceRefOrValue:com.asyncapi.model.RelatedPlaceRefOrValue," +
        
        "RelatedEntityRefOrValue:com.asyncapi.model.RelatedEntityRefOrValue," +
        
        "RelatedParty:com.asyncapi.model.RelatedParty," +
        
        "RelatedServiceOrderItem:com.asyncapi.model.RelatedServiceOrderItem," +
        
        "ServiceRelationship:com.asyncapi.model.ServiceRelationship," +
        
        "ServiceRefOrValue:com.asyncapi.model.ServiceRefOrValue," +
        
        "ResourceRef:com.asyncapi.model.ResourceRef," +
        
        "PatchServiceUpdated:com.asyncapi.model.PatchServiceUpdated," +
        
        "BadRequestResponse:com.asyncapi.model.BadRequestResponse," +
        
        "Error:com.asyncapi.model.Error," +
        
        "UnauthorizedResponse:com.asyncapi.model.UnauthorizedResponse," +
        
        "ForbiddenResponse:com.asyncapi.model.ForbiddenResponse," +
        
        "NotFoundResponse:com.asyncapi.model.NotFoundResponse," +
        
        "MethodNotAllowedResponse:com.asyncapi.model.MethodNotAllowedResponse," +
        
        "ConflictResponse:com.asyncapi.model.ConflictResponse," +
        
        "InternalServerErrorResponse:com.asyncapi.model.InternalServerErrorResponse," +
        
        "CreateServiceRequestPayload:com.asyncapi.model.CreateServiceRequestPayload," +
        
        "ServiceCreate:com.asyncapi.model.ServiceCreate," +
        
        "CreateServiceCreated:com.asyncapi.model.CreateServiceCreated," +
        
        "ServiceBaseEvent:com.asyncapi.model.ServiceBaseEvent," +
        
        "ServiceBasePlusEvent:com.asyncapi.model.ServiceBasePlusEvent," +
        
        "RetrieveServiceRequestPayload:com.asyncapi.model.RetrieveServiceRequestPayload," +
        
        "RetrieveServiceSuccess:com.asyncapi.model.RetrieveServiceSuccess," +
        
        "ListServiceRequestPayload:com.asyncapi.model.ListServiceRequestPayload," +
        
        "ListServiceSuccess:com.asyncapi.model.ListServiceSuccess," +
        
        "DeleteServiceRequestPayload:com.asyncapi.model.DeleteServiceRequestPayload," +
        
        "DeleteServiceDeleted:com.asyncapi.model.DeleteServiceDeleted," +
        
        "Place:com.asyncapi.model.Place," +
        
        "PlaceRef:com.asyncapi.model.PlaceRef," +
        
        "EntityRef:com.asyncapi.model.EntityRef," +
        
        "Extensible:com.asyncapi.model.Extensible," +
        
        "Entity:com.asyncapi.model.Entity," +
        
        "ReferredType:com.asyncapi.model.ReferredType," +
        
        "ServiceRef:com.asyncapi.model.ServiceRef," +
        
        "Addressable:com.asyncapi.model.Addressable," +
        
        "EntityValue:com.asyncapi.model.EntityValue," +
        
        "TimePeriod:com.asyncapi.model.TimePeriod"
        );
        props.put(JsonDeserializer.TRUSTED_PACKAGES, "com.asyncapi.model");
        return props;
    }

}
