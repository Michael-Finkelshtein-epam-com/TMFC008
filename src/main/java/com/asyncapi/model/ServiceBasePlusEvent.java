package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * The notification data structure
 */
public class ServiceBasePlusEvent implements ServiceNotification.OneOfServiceBaseEventServiceBasePlusEvent {
    
                  
    private @Valid String correlationId;
    
                  
    private @Valid String description;
    
                  
    private @Valid String domain;
    
                  
    private @Valid String eventId;
    
                
    private @Valid java.time.OffsetDateTime eventTime;
    
        
    public enum EventTypeEnum {
            
        ATTRIBUTEVALUECHANGE(String.valueOf("attributeValueChange"));
            
        private String value;

        
        EventTypeEnum (String v) {

            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
                
        public static EventTypeEnum fromValue(String value) {   
            for ( EventTypeEnum b :  EventTypeEnum.values()) {
                if (Objects.equals(b.value, value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

            
    private @Valid EventTypeEnum eventType;
    
                  
    private @Valid String fieldPath;
    
                  
    private @Valid String priority;
    
                
    private @Valid java.time.OffsetDateTime timeOcurred;
    
                  
    private @Valid String title;
    
    private @Valid ServiceEventPayload event;
    

    
        
        


    /**
     * The correlation id for this event.
     */
    @JsonProperty("correlationId")
    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }
    
        
        


    /**
     * An explnatory of the event.
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
        
        


    /**
     * The domain of the event.
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
    
        
        


    /**
     * The identifier of the notification.
     */
    @JsonProperty("eventId")
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    
        
        


    /**
     * Time of the event occurrence.
     */
    @JsonProperty("eventTime")
    public java.time.OffsetDateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(java.time.OffsetDateTime eventTime) {
        this.eventTime = eventTime;
    }
    
        
        


    /**
     * The type of the notification.
     */
    @JsonProperty("eventType")
    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }
    
        
        


    /**
     * The path identifying the object field concerned by this notification.
     */
    @JsonProperty("fieldPath")
    public String getFieldPath() {
        return fieldPath;
    }

    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }
    
        
        


    /**
     * A priority.
     */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    
        
        


    /**
     * The time the event occured.
     */
    @JsonProperty("timeOcurred")
    public java.time.OffsetDateTime getTimeOcurred() {
        return timeOcurred;
    }

    public void setTimeOcurred(java.time.OffsetDateTime timeOcurred) {
        this.timeOcurred = timeOcurred;
    }
    
        
        


    /**
     * The title of the event.
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
        
        


    /**
     * The event payload linked to the involved resource object
     */
    @JsonProperty("event")
    public ServiceEventPayload getEvent() {
        return event;
    }

    public void setEvent(ServiceEventPayload event) {
        this.event = event;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceBasePlusEvent serviceBasePlusEvent = (ServiceBasePlusEvent) o;
        return 
            Objects.equals(this.correlationId, serviceBasePlusEvent.correlationId) &&
            Objects.equals(this.description, serviceBasePlusEvent.description) &&
            Objects.equals(this.domain, serviceBasePlusEvent.domain) &&
            Objects.equals(this.eventId, serviceBasePlusEvent.eventId) &&
            Objects.equals(this.eventTime, serviceBasePlusEvent.eventTime) &&
            Objects.equals(this.eventType, serviceBasePlusEvent.eventType) &&
            Objects.equals(this.fieldPath, serviceBasePlusEvent.fieldPath) &&
            Objects.equals(this.priority, serviceBasePlusEvent.priority) &&
            Objects.equals(this.timeOcurred, serviceBasePlusEvent.timeOcurred) &&
            Objects.equals(this.title, serviceBasePlusEvent.title) &&
            Objects.equals(this.event, serviceBasePlusEvent.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correlationId, description, domain, eventId, eventTime, eventType, fieldPath, priority, timeOcurred, title, event);
    }

    @Override
    public String toString() {
        return "class ServiceBasePlusEvent {\n" +
        
                "    correlationId: " + toIndentedString(correlationId) + "\n" +
                "    description: " + toIndentedString(description) + "\n" +
                "    domain: " + toIndentedString(domain) + "\n" +
                "    eventId: " + toIndentedString(eventId) + "\n" +
                "    eventTime: " + toIndentedString(eventTime) + "\n" +
                "    eventType: " + toIndentedString(eventType) + "\n" +
                "    fieldPath: " + toIndentedString(fieldPath) + "\n" +
                "    priority: " + toIndentedString(priority) + "\n" +
                "    timeOcurred: " + toIndentedString(timeOcurred) + "\n" +
                "    title: " + toIndentedString(title) + "\n" +
                "    event: " + toIndentedString(event) + "\n" +
                "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
           return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}