package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * Related Entity reference. A related place defines a place described by reference or by value linked to a specific entity. The polymorphic attributes @type, @schemaLocation & @referredType are related to the place entity and not the RelatedPlaceRefOrValue class itself
 */
public class RelatedPlaceRefOrValue {
    
                  
    private @Valid String href;
    
                  
    private @Valid String id;
    
                
    private @Valid String atBaseType;
    
                
    private @Valid Object atSchemaLocation;
    
                
    private @Valid String atType;
    
                
    private @Valid String atReferredType;
    
                  
    private @Valid String name;
    
                  
    private @Valid String role;
    

    
        
        


    /**
     * Unique reference of the place
     */
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
    
        
        


    /**
     * Unique identifier of the place
     */
    @JsonProperty("id")
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
     * A user-friendly name for the place, such as [Paris Store], [London Store], [Main Home]
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        
        


    
    @JsonProperty("role")@NotNull
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RelatedPlaceRefOrValue relatedPlaceRefOrValue = (RelatedPlaceRefOrValue) o;
        return 
            Objects.equals(this.href, relatedPlaceRefOrValue.href) &&
            Objects.equals(this.id, relatedPlaceRefOrValue.id) &&
            Objects.equals(this.atBaseType, relatedPlaceRefOrValue.atBaseType) &&
            Objects.equals(this.atSchemaLocation, relatedPlaceRefOrValue.atSchemaLocation) &&
            Objects.equals(this.atType, relatedPlaceRefOrValue.atType) &&
            Objects.equals(this.atReferredType, relatedPlaceRefOrValue.atReferredType) &&
            Objects.equals(this.name, relatedPlaceRefOrValue.name) &&
            Objects.equals(this.role, relatedPlaceRefOrValue.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, atBaseType, atSchemaLocation, atType, atReferredType, name, role);
    }

    @Override
    public String toString() {
        return "class RelatedPlaceRefOrValue {\n" +
        
                "    href: " + toIndentedString(href) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    atBaseType: " + toIndentedString(atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(atType) + "\n" +
                "    atReferredType: " + toIndentedString(atReferredType) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    role: " + toIndentedString(role) + "\n" +
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