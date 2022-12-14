package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 


public class CorrelationHeader {
    
                
    private @Valid Object correlationId;
    

    
        
        


    /**
     * Correlation ID set by application
     */
    @JsonProperty("CORRELATION_ID")@NotNull
    public Object getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(Object correlationId) {
        this.correlationId = correlationId;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorrelationHeader correlationHeader = (CorrelationHeader) o;
        return 
            Objects.equals(this.correlationId, correlationHeader.correlationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correlationId);
    }

    @Override
    public String toString() {
        return "class CorrelationHeader {\n" +
        
                "    correlationId: " + toIndentedString(correlationId) + "\n" +
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