package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * Place reference. Place defines the places where the products are sold or delivered.
 */
public class Place {
    
                  
    private @Valid String href;
    
                  
    private @Valid String id;
    
                
    private @Valid String atBaseType;
    
                
    private @Valid Object atSchemaLocation;
    
                
    private @Valid String atType;
    
                  
    private @Valid String name;
    

    
        
        


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
     * A user-friendly name for the place, such as [Paris Store], [London Store], [Main Home]
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Place place = (Place) o;
        return 
            Objects.equals(this.href, place.href) &&
            Objects.equals(this.id, place.id) &&
            Objects.equals(this.atBaseType, place.atBaseType) &&
            Objects.equals(this.atSchemaLocation, place.atSchemaLocation) &&
            Objects.equals(this.atType, place.atType) &&
            Objects.equals(this.name, place.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, atBaseType, atSchemaLocation, atType, name);
    }

    @Override
    public String toString() {
        return "class Place {\n" +
        
                "    href: " + toIndentedString(href) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    atBaseType: " + toIndentedString(atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(atType) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
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