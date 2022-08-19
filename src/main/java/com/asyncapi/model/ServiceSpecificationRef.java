package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * The specification from which this service was instantiated
 */
public class ServiceSpecificationRef {
    
                
    private @Valid Object href;
    
                  
    private @Valid String id;
    
                
    private @Valid String atBaseType;
    
                
    private @Valid Object atSchemaLocation;
    
                
    private @Valid String atType;
    
                
    private @Valid String atReferredType;
    
                  
    private @Valid String name;
    
                  
    private @Valid String version;
    

    
        
        


    /**
     * Hyperlink reference
     */
    @JsonProperty("href")
    public Object getHref() {
        return href;
    }

    public void setHref(Object href) {
        this.href = href;
    }
    
        
        


    /**
     * unique identifier
     */
    @JsonProperty("id")@NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
        
        


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
     * The actual type of the target instance when needed for disambiguation.
     */
    @JsonProperty("@referredType")
    public String getAtReferredType() {
        return atReferredType;
    }

    public void setAtReferredType(String atReferredType) {
        this.atReferredType = atReferredType;
    }
    
        
        


    /**
     * Name of the related entity.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        
        


    /**
     * Service specification version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceSpecificationRef serviceSpecificationRef = (ServiceSpecificationRef) o;
        return 
            Objects.equals(this.href, serviceSpecificationRef.href) &&
            Objects.equals(this.id, serviceSpecificationRef.id) &&
            Objects.equals(this.atBaseType, serviceSpecificationRef.atBaseType) &&
            Objects.equals(this.atSchemaLocation, serviceSpecificationRef.atSchemaLocation) &&
            Objects.equals(this.atType, serviceSpecificationRef.atType) &&
            Objects.equals(this.atReferredType, serviceSpecificationRef.atReferredType) &&
            Objects.equals(this.name, serviceSpecificationRef.name) &&
            Objects.equals(this.version, serviceSpecificationRef.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, atBaseType, atSchemaLocation, atType, atReferredType, name, version);
    }

    @Override
    public String toString() {
        return "class ServiceSpecificationRef {\n" +
        
                "    href: " + toIndentedString(href) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    atBaseType: " + toIndentedString(atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(atType) + "\n" +
                "    atReferredType: " + toIndentedString(atReferredType) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    version: " + toIndentedString(version) + "\n" +
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