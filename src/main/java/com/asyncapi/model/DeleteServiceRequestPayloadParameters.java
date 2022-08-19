package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 


public class DeleteServiceRequestPayloadParameters {
    
                  
    private @Valid String id;
    

    
        
        


    /**
     * Identifier of the Service
     */
    @JsonProperty("id")@NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteServiceRequestPayloadParameters deleteServiceRequestPayloadParameters = (DeleteServiceRequestPayloadParameters) o;
        return 
            Objects.equals(this.id, deleteServiceRequestPayloadParameters.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "class DeleteServiceRequestPayloadParameters {\n" +
        
                "    id: " + toIndentedString(id) + "\n" +
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