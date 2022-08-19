package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * Used when an API throws an Error, typically with a HTTP error response-code (3xx, 4xx, 5xx)
 */
public class Error {
    
                
    private @Valid String atBaseType;
    
                
    private @Valid Object atSchemaLocation;
    
                
    private @Valid String atType;
    
                  
    private @Valid String code;
    
                  
    private @Valid String message;
    
                  
    private @Valid String reason;
    
                
    private @Valid Object referenceError;
    
                  
    private @Valid String status;
    

    
        
        


    /**
     * When sub-classing, this defines the super-class
     */
    @JsonProperty("@baseType")
    public String getAtBaseType() {
        return atBaseType;
    }

    public void setAtBaseType(String atBaseType) {
        this.atBaseType = atBaseType;
    }
    
        
        


    /**
     * A URI to a JSON-Schema file that defines additional attributes and relationships
     */
    @JsonProperty("@schemaLocation")
    public Object getAtSchemaLocation() {
        return atSchemaLocation;
    }

    public void setAtSchemaLocation(Object atSchemaLocation) {
        this.atSchemaLocation = atSchemaLocation;
    }
    
        
        


    /**
     * When sub-classing, this defines the sub-class Extensible name
     */
    @JsonProperty("@type")
    public String getAtType() {
        return atType;
    }

    public void setAtType(String atType) {
        this.atType = atType;
    }
    
        
        


    /**
     * Application relevant detail, defined in the API or a common list.
     */
    @JsonProperty("code")@NotNull
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
        
        


    /**
     * More details and corrective actions related to the error which can be shown to a client user.
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
        
        


    /**
     * Explanation of the reason for the error which can be shown to a client user.
     */
    @JsonProperty("reason")@NotNull
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
        
        


    /**
     * URI of documentation describing the error.
     */
    @JsonProperty("referenceError")
    public Object getReferenceError() {
        return referenceError;
    }

    public void setReferenceError(Object referenceError) {
        this.referenceError = referenceError;
    }
    
        
        


    /**
     * HTTP Error code extension
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return 
            Objects.equals(this.atBaseType, error.atBaseType) &&
            Objects.equals(this.atSchemaLocation, error.atSchemaLocation) &&
            Objects.equals(this.atType, error.atType) &&
            Objects.equals(this.code, error.code) &&
            Objects.equals(this.message, error.message) &&
            Objects.equals(this.reason, error.reason) &&
            Objects.equals(this.referenceError, error.referenceError) &&
            Objects.equals(this.status, error.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atBaseType, atSchemaLocation, atType, code, message, reason, referenceError, status);
    }

    @Override
    public String toString() {
        return "class Error {\n" +
        
                "    atBaseType: " + toIndentedString(atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(atType) + "\n" +
                "    code: " + toIndentedString(code) + "\n" +
                "    message: " + toIndentedString(message) + "\n" +
                "    reason: " + toIndentedString(reason) + "\n" +
                "    referenceError: " + toIndentedString(referenceError) + "\n" +
                "    status: " + toIndentedString(status) + "\n" +
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