package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * Deleted
 */
public class DeleteServiceDeleted implements DeleteServiceResponse.OneOfDeleteServiceDeletedBadRequestResponseUnauthorizedResponseForbiddenResponseNotFoundResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse {
    
                  
    private @Valid int statusCode;
    

    
        
        


    
    @JsonProperty("statusCode")@NotNull
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteServiceDeleted deleteServiceDeleted = (DeleteServiceDeleted) o;
        return 
            Objects.equals(this.statusCode, deleteServiceDeleted.statusCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode);
    }

    @Override
    public String toString() {
        return "class DeleteServiceDeleted {\n" +
        
                "    statusCode: " + toIndentedString(statusCode) + "\n" +
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