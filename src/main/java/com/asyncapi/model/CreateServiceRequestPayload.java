package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 


public class CreateServiceRequestPayload {
    
    private @Valid ServiceCreate body;
    

    
        
        


    /**
     * Service is a base class for defining the Service hierarchy. All Services are characterized as either being possibly visible and usable by a Customer or not. This gives rise to the two subclasses of Service: CustomerFacingService and ResourceFacingService.
     * Skipped properties: href,id
     */
    @JsonProperty("body")@NotNull
    public ServiceCreate getBody() {
        return body;
    }

    public void setBody(ServiceCreate body) {
        this.body = body;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateServiceRequestPayload createServiceRequestPayload = (CreateServiceRequestPayload) o;
        return 
            Objects.equals(this.body, createServiceRequestPayload.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        return "class CreateServiceRequestPayload {\n" +
        
                "    body: " + toIndentedString(body) + "\n" +
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