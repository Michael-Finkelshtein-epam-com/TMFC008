package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * The period for which this feature relationship is valid.
 */
public class FeatureRelationshipValidFor {
    
                
    private @Valid java.time.OffsetDateTime endDateTime;
    
                
    private @Valid java.time.OffsetDateTime startDateTime;
    

    
        
        


    /**
     * End of the time period, using IETC-RFC-3339 format
     */
    @JsonProperty("endDateTime")
    public java.time.OffsetDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(java.time.OffsetDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }
    
        
        


    /**
     * Start of the time period, using IETC-RFC-3339 format
     */
    @JsonProperty("startDateTime")
    public java.time.OffsetDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(java.time.OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeatureRelationshipValidFor featureRelationshipValidFor = (FeatureRelationshipValidFor) o;
        return 
            Objects.equals(this.endDateTime, featureRelationshipValidFor.endDateTime) &&
            Objects.equals(this.startDateTime, featureRelationshipValidFor.startDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endDateTime, startDateTime);
    }

    @Override
    public String toString() {
        return "class FeatureRelationshipValidFor {\n" +
        
                "    endDateTime: " + toIndentedString(endDateTime) + "\n" +
                "    startDateTime: " + toIndentedString(startDateTime) + "\n" +
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