package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 


public class ListServiceRequestPayload {
    
    private @Valid ListServiceRequestPayloadParameters parameters;
    
    private @Valid ListServiceRequestPayloadFilters filters;
    

    
        
        


    
    @JsonProperty("parameters")@NotNull
    public ListServiceRequestPayloadParameters getParameters() {
        return parameters;
    }

    public void setParameters(ListServiceRequestPayloadParameters parameters) {
        this.parameters = parameters;
    }
    
        
        


    
    @JsonProperty("filters")
    public ListServiceRequestPayloadFilters getFilters() {
        return filters;
    }

    public void setFilters(ListServiceRequestPayloadFilters filters) {
        this.filters = filters;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServiceRequestPayload listServiceRequestPayload = (ListServiceRequestPayload) o;
        return 
            Objects.equals(this.parameters, listServiceRequestPayload.parameters) &&
            Objects.equals(this.filters, listServiceRequestPayload.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters, filters);
    }

    @Override
    public String toString() {
        return "class ListServiceRequestPayload {\n" +
        
                "    parameters: " + toIndentedString(parameters) + "\n" +
                "    filters: " + toIndentedString(filters) + "\n" +
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