package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * A referred entity
 */
public class ReferredType {
    
                
    private @Valid String atReferredType;
    

    
        
        


    /**
     * The actual type of the target instance when needed for disambiguation.
     */
    @JsonProperty("@referredType")
    public String getAtReferredType() {
        return atReferredType;
    }

    public void setAtReferredType(String atReferredType) {
        this.atReferredType = atReferredType;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReferredType referredType = (ReferredType) o;
        return 
            Objects.equals(this.atReferredType, referredType.atReferredType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atReferredType);
    }

    @Override
    public String toString() {
        return "class ReferredType {\n" +
        
                "    atReferredType: " + toIndentedString(atReferredType) + "\n" +
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