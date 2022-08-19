
package com.asyncapi.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME, 
    include = JsonTypeInfo.As.PROPERTY, 
    property = "eventType",
    visible = true)
    @JsonSubTypes({
@Type(value=ServiceBaseEvent.class),
@Type(value=ServiceBasePlusEvent.class),
 })
public abstract interface OneOfServiceBaseEventServiceBasePlusEvent {
}