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
public class ServiceBaseEvent implements ServiceNotification.OneOfServiceBaseEventServiceBasePlusEvent {
    
                  
    private @Valid String correlationId;
    
                  
    private @Valid String description;
    
                  
    private @Valid String domain;
    
    private @Valid ServiceEventPayload event;
    
                  
    private @Valid String eventId;
    
                
    private @Valid java.time.OffsetDateTime eventTime;
    
        
    public enum EventTypeEnum {
            
        CREATE(String.valueOf("create")),
            
        DELETE(String.valueOf("delete")),
            
        STATECHANGE(String.valueOf("stateChange"));
            
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
    
                  
    private @Valid String priority;
    
                
    private @Valid java.time.OffsetDateTime timeOcurred;
    
                  
    private @Valid String title;
    

    
        
        


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
     * The event payload linked to the involved resource object
     */
    @JsonProperty("event")
    public ServiceEventPayload getEvent() {
        return event;
    }

    public void setEvent(ServiceEventPayload event) {
        this.event = event;
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
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceBaseEvent serviceBaseEvent = (ServiceBaseEvent) o;
        return 
            Objects.equals(this.correlationId, serviceBaseEvent.correlationId) &&
            Objects.equals(this.description, serviceBaseEvent.description) &&
            Objects.equals(this.domain, serviceBaseEvent.domain) &&
            Objects.equals(this.event, serviceBaseEvent.event) &&
            Objects.equals(this.eventId, serviceBaseEvent.eventId) &&
            Objects.equals(this.eventTime, serviceBaseEvent.eventTime) &&
            Objects.equals(this.eventType, serviceBaseEvent.eventType) &&
            Objects.equals(this.priority, serviceBaseEvent.priority) &&
            Objects.equals(this.timeOcurred, serviceBaseEvent.timeOcurred) &&
            Objects.equals(this.title, serviceBaseEvent.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correlationId, description, domain, event, eventId, eventTime, eventType, priority, timeOcurred, title);
    }

    @Override
    public String toString() {
        return "class ServiceBaseEvent {\n" +
        
                "    correlationId: " + toIndentedString(correlationId) + "\n" +
                "    description: " + toIndentedString(description) + "\n" +
                "    domain: " + toIndentedString(domain) + "\n" +
                "    event: " + toIndentedString(event) + "\n" +
                "    eventId: " + toIndentedString(eventId) + "\n" +
                "    eventTime: " + toIndentedString(eventTime) + "\n" +
                "    eventType: " + toIndentedString(eventType) + "\n" +
                "    priority: " + toIndentedString(priority) + "\n" +
                "    timeOcurred: " + toIndentedString(timeOcurred) + "\n" +
                "    title: " + toIndentedString(title) + "\n" +
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