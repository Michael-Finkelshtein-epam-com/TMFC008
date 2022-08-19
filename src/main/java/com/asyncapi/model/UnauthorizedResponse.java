package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * Unauthorized
 */
public class UnauthorizedResponse implements PatchServiceResponse.OneOfPatchServiceUpdatedBadRequestResponseUnauthorizedResponseForbiddenResponseNotFoundResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse, CreateServiceResponse.OneOfCreateServiceCreatedBadRequestResponseUnauthorizedResponseForbiddenResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse, RetrieveServiceResponse.OneOfRetrieveServiceSuccessBadRequestResponseUnauthorizedResponseForbiddenResponseNotFoundResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse, ListServiceResponse.OneOfListServiceSuccessBadRequestResponseUnauthorizedResponseForbiddenResponseNotFoundResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse, DeleteServiceResponse.OneOfDeleteServiceDeletedBadRequestResponseUnauthorizedResponseForbiddenResponseNotFoundResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse {
    
                  
    private @Valid int statusCode;
    
    private @Valid Error body;
    

    
        
        


    
    @JsonProperty("statusCode")@NotNull
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
    
        
        


    /**
     * Used when an API throws an Error, typically with a HTTP error response-code (3xx, 4xx, 5xx)
     */
    @JsonProperty("body")@NotNull
    public Error getBody() {
        return body;
    }

    public void setBody(Error body) {
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
        UnauthorizedResponse unauthorizedResponse = (UnauthorizedResponse) o;
        return 
            Objects.equals(this.statusCode, unauthorizedResponse.statusCode) &&
            Objects.equals(this.body, unauthorizedResponse.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, body);
    }

    @Override
    public String toString() {
        return "class UnauthorizedResponse {\n" +
        
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