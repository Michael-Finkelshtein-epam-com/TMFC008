package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * Updated
 */
public class PatchServiceUpdated implements PatchServiceResponse.OneOfPatchServiceUpdatedBadRequestResponseUnauthorizedResponseForbiddenResponseNotFoundResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse {
    
                  
    private @Valid int statusCode;
    
    private @Valid Service body;
    

    
        
        


    
    @JsonProperty("statusCode")@NotNull
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
    
        
        


    /**
     * Service is a base class for defining the Service hierarchy. All Services are characterized as either being possibly visible and usable by a Customer or not. This gives rise to the two subclasses of Service: CustomerFacingService and ResourceFacingService.
     */
    @JsonProperty("body")@NotNull
    public Service getBody() {
        return body;
    }

    public void setBody(Service body) {
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
        PatchServiceUpdated patchServiceUpdated = (PatchServiceUpdated) o;
        return 
            Objects.equals(this.statusCode, patchServiceUpdated.statusCode) &&
            Objects.equals(this.body, patchServiceUpdated.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, body);
    }

    @Override
    public String toString() {
        return "class PatchServiceUpdated {\n" +
        
                "    statusCode: " + toIndentedString(statusCode) + "\n" +
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