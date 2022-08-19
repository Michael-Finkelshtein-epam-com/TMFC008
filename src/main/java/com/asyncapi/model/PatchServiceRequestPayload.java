package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 


public class PatchServiceRequestPayload {
    
    private @Valid ServiceUpdate body;
    
    private @Valid PatchServiceRequestPayloadParameters parameters;
    

    
        
        


    /**
     * Service is a base class for defining the Service hierarchy. All Services are characterized as either being possibly visible and usable by a Customer or not. This gives rise to the two subclasses of Service: CustomerFacingService and ResourceFacingService.
     * Skipped properties: href,id,serviceDate
     */
    @JsonProperty("body")@NotNull
    public ServiceUpdate getBody() {
        return body;
    }

    public void setBody(ServiceUpdate body) {
        this.body = body;
    }
    
        
        


    
    @JsonProperty("parameters")@NotNull
    public PatchServiceRequestPayloadParameters getParameters() {
        return parameters;
    }

    public void setParameters(PatchServiceRequestPayloadParameters parameters) {
        this.parameters = parameters;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PatchServiceRequestPayload patchServiceRequestPayload = (PatchServiceRequestPayload) o;
        return 
            Objects.equals(this.body, patchServiceRequestPayload.body) &&
            Objects.equals(this.parameters, patchServiceRequestPayload.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, parameters);
    }

    @Override
    public String toString() {
        return "class PatchServiceRequestPayload {\n" +
        
                "    body: " + toIndentedString(body) + "\n" +
                "    parameters: " + toIndentedString(parameters) + "\n" +
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