package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * Success
 */
public class ListServiceSuccess implements ListServiceResponse.OneOfListServiceSuccessBadRequestResponseUnauthorizedResponseForbiddenResponseNotFoundResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse {
    
                  
    private @Valid int statusCode;
    
    private @Valid List<Service> bodyList;
    
                  
    private @Valid Object headers;
    

    
        
        


    
    @JsonProperty("statusCode")@NotNull
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
    
        
        


    
    @JsonProperty("body")@NotNull
    public List<Service> getBody() {
        return bodyList;
    }

    public void setBody(List<Service> bodyList) {
        this.bodyList = bodyList;
    }
    
        
        


    
    @JsonProperty("headers")
    public Object getHeaders() {
        return headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServiceSuccess listServiceSuccess = (ListServiceSuccess) o;
        return 
            Objects.equals(this.statusCode, listServiceSuccess.statusCode) &&
            Objects.equals(this.bodyList, listServiceSuccess.bodyList) &&
            Objects.equals(this.headers, listServiceSuccess.headers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, bodyList, headers);
    }

    @Override
    public String toString() {
        return "class ListServiceSuccess {\n" +
        
                "    statusCode: " + toIndentedString(statusCode) + "\n" +
                "    bodyList: " + toIndentedString(bodyList) + "\n" +
                "    headers: " + toIndentedString(headers) + "\n" +
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