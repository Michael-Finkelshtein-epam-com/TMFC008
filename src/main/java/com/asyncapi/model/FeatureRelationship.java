package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * Configuration feature
 */
public class FeatureRelationship {
    
                
    private @Valid Object href;
    
                  
    private @Valid String id;
    
                
    private @Valid String atBaseType;
    
                
    private @Valid Object atSchemaLocation;
    
                
    private @Valid String atType;
    
                  
    private @Valid String name;
    
        
    public enum RelationshipTypeEnum {
            
        EXCLUDED(String.valueOf("excluded")),
            
        INCLUDES(String.valueOf("includes")),
            
        MAY_INCLUDE(String.valueOf("may include")),
            
        REQUIRES(String.valueOf("requires"));
            
        private String value;

        
        RelationshipTypeEnum (String v) {

            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
                
        public static RelationshipTypeEnum fromValue(String value) {   
            for ( RelationshipTypeEnum b :  RelationshipTypeEnum.values()) {
                if (Objects.equals(b.value, value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

            
    private @Valid RelationshipTypeEnum relationshipType;
    
    private @Valid FeatureRelationshipValidFor validFor;
    

    
        
        


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
     * Unique identifier of the target feature.
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
     * This is the name of the target feature.
     */
    @JsonProperty("name")@NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        
        


    /**
     * This is the type of the feature relationship.
     */
    @JsonProperty("relationshipType")@NotNull
    public RelationshipTypeEnum getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(RelationshipTypeEnum relationshipType) {
        this.relationshipType = relationshipType;
    }
    
        
        


    /**
     * The period for which this feature relationship is valid.
     */
    @JsonProperty("validFor")
    public FeatureRelationshipValidFor getValidFor() {
        return validFor;
    }

    public void setValidFor(FeatureRelationshipValidFor validFor) {
        this.validFor = validFor;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeatureRelationship featureRelationship = (FeatureRelationship) o;
        return 
            Objects.equals(this.href, featureRelationship.href) &&
            Objects.equals(this.id, featureRelationship.id) &&
            Objects.equals(this.atBaseType, featureRelationship.atBaseType) &&
            Objects.equals(this.atSchemaLocation, featureRelationship.atSchemaLocation) &&
            Objects.equals(this.atType, featureRelationship.atType) &&
            Objects.equals(this.name, featureRelationship.name) &&
            Objects.equals(this.relationshipType, featureRelationship.relationshipType) &&
            Objects.equals(this.validFor, featureRelationship.validFor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, atBaseType, atSchemaLocation, atType, name, relationshipType, validFor);
    }

    @Override
    public String toString() {
        return "class FeatureRelationship {\n" +
        
                "    href: " + toIndentedString(href) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    atBaseType: " + toIndentedString(atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(atType) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    relationshipType: " + toIndentedString(relationshipType) + "\n" +
                "    validFor: " + toIndentedString(validFor) + "\n" +
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