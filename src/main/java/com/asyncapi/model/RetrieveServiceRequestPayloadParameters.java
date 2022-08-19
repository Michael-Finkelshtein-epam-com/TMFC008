package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 


public class RetrieveServiceRequestPayloadParameters {
    
                  
    private @Valid String id;
    
                  
    private @Valid String fields;
    

    
        
        


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
    
        
        


    /**
     * Comma-separated properties to provide in response
     */
    @JsonProperty("fields")
    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetrieveServiceRequestPayloadParameters retrieveServiceRequestPayloadParameters = (RetrieveServiceRequestPayloadParameters) o;
        return 
            Objects.equals(this.id, retrieveServiceRequestPayloadParameters.id) &&
            Objects.equals(this.fields, retrieveServiceRequestPayloadParameters.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fields);
    }

    @Override
    public String toString() {
        return "class RetrieveServiceRequestPayloadParameters {\n" +
        
                "    id: " + toIndentedString(id) + "\n" +
                "    fields: " + toIndentedString(fields) + "\n" +
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