package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 


public class ListServiceRequestPayloadParameters {
    
                  
    private @Valid String fields;
    
                  
    private @Valid Integer offset;
    
                  
    private @Valid Integer limit;
    

    
        
        


    /**
     * Comma-separated properties to be provided in response
     */
    @JsonProperty("fields")
    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }
    
        
        


    /**
     * Requested index for start of resources to be provided in response
     */
    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    
        
        


    /**
     * Requested number of resources to be provided in response
     */
    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServiceRequestPayloadParameters listServiceRequestPayloadParameters = (ListServiceRequestPayloadParameters) o;
        return 
            Objects.equals(this.fields, listServiceRequestPayloadParameters.fields) &&
            Objects.equals(this.offset, listServiceRequestPayloadParameters.offset) &&
            Objects.equals(this.limit, listServiceRequestPayloadParameters.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, offset, limit);
    }

    @Override
    public String toString() {
        return "class ListServiceRequestPayloadParameters {\n" +
        
                "    fields: " + toIndentedString(fields) + "\n" +
                "    offset: " + toIndentedString(offset) + "\n" +
                "    limit: " + toIndentedString(limit) + "\n" +
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