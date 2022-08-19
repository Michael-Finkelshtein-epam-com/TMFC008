package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * Configuration feature.
 */
public class Feature {
    
                
    private @Valid Object href;
    
                  
    private @Valid String id;
    
                
    private @Valid String atBaseType;
    
                
    private @Valid Object atSchemaLocation;
    
                
    private @Valid String atType;
    
    private @Valid List<ConstraintRef> constraintList;
    
    private @Valid List<Characteristic> featureCharacteristicList;
    
    private @Valid List<FeatureRelationship> featureRelationshipList;
    
                  
    private @Valid Boolean isBundle;
    
                  
    private @Valid Boolean isEnabled;
    
                  
    private @Valid String name;
    

    
        
        


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
     * Unique identifier of the feature.
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
     * This is a list of feature constraints.
     */
    @JsonProperty("constraint")
    public List<ConstraintRef> getConstraint() {
        return constraintList;
    }

    public void setConstraint(List<ConstraintRef> constraintList) {
        this.constraintList = constraintList;
    }
    
        
        


    /**
     * This is a list of Characteristics for a particular feature.
     */
    @JsonProperty("featureCharacteristic")@NotNull@Size(min = 1)
    public List<Characteristic> getFeatureCharacteristic() {
        return featureCharacteristicList;
    }

    public void setFeatureCharacteristic(List<Characteristic> featureCharacteristicList) {
        this.featureCharacteristicList = featureCharacteristicList;
    }
    
        
        


    
    @JsonProperty("featureRelationship")
    public List<FeatureRelationship> getFeatureRelationship() {
        return featureRelationshipList;
    }

    public void setFeatureRelationship(List<FeatureRelationship> featureRelationshipList) {
        this.featureRelationshipList = featureRelationshipList;
    }
    
        
        


    /**
     * True if this is a feature group. Default is false.
     */
    @JsonProperty("isBundle")
    public Boolean getIsBundle() {
        return isBundle;
    }

    public void setIsBundle(Boolean isBundle) {
        this.isBundle = isBundle;
    }
    
        
        


    /**
     * True if this feature is enabled. Default is true.
     */
    @JsonProperty("isEnabled")
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }
    
        
        


    /**
     * This is the name for the feature.
     */
    @JsonProperty("name")@NotNull
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
        Feature feature = (Feature) o;
        return 
            Objects.equals(this.href, feature.href) &&
            Objects.equals(this.id, feature.id) &&
            Objects.equals(this.atBaseType, feature.atBaseType) &&
            Objects.equals(this.atSchemaLocation, feature.atSchemaLocation) &&
            Objects.equals(this.atType, feature.atType) &&
            Objects.equals(this.constraintList, feature.constraintList) &&
            Objects.equals(this.featureCharacteristicList, feature.featureCharacteristicList) &&
            Objects.equals(this.featureRelationshipList, feature.featureRelationshipList) &&
            Objects.equals(this.isBundle, feature.isBundle) &&
            Objects.equals(this.isEnabled, feature.isEnabled) &&
            Objects.equals(this.name, feature.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, atBaseType, atSchemaLocation, atType, constraintList, featureCharacteristicList, featureRelationshipList, isBundle, isEnabled, name);
    }

    @Override
    public String toString() {
        return "class Feature {\n" +
        
                "    href: " + toIndentedString(href) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    atBaseType: " + toIndentedString(atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(atType) + "\n" +
                "    constraintList: " + toIndentedString(constraintList) + "\n" +
                "    featureCharacteristicList: " + toIndentedString(featureCharacteristicList) + "\n" +
                "    featureRelationshipList: " + toIndentedString(featureRelationshipList) + "\n" +
                "    isBundle: " + toIndentedString(isBundle) + "\n" +
                "    isEnabled: " + toIndentedString(isEnabled) + "\n" +
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