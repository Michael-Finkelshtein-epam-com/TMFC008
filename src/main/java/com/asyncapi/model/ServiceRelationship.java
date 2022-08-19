package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 


public class ServiceRelationship {
    
                
    private @Valid Object href;
    
                  
    private @Valid String id;
    
                
    private @Valid String atBaseType;
    
                
    private @Valid Object atSchemaLocation;
    
                
    private @Valid String atType;
    
                  
    private @Valid String relationshipType;
    
    private @Valid ServiceRefOrValue service;
    
    private @Valid List<Characteristic> serviceRelationshipCharacteristicList;
    

    
        
        


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
    
        
        


    
    @JsonProperty("relationshipType")@NotNull
    public String getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }
    
        
        


    /**
     * A Service to be created defined by value or existing defined by reference. The polymorphic attributes @type, @schemaLocation & @referredType are related to the Service entity and not the RelatedServiceRefOrValue class itself
     */
    @JsonProperty("service")@NotNull
    public ServiceRefOrValue getService() {
        return service;
    }

    public void setService(ServiceRefOrValue service) {
        this.service = service;
    }
    
        
        


    
    @JsonProperty("serviceRelationshipCharacteristic")
    public List<Characteristic> getServiceRelationshipCharacteristic() {
        return serviceRelationshipCharacteristicList;
    }

    public void setServiceRelationshipCharacteristic(List<Characteristic> serviceRelationshipCharacteristicList) {
        this.serviceRelationshipCharacteristicList = serviceRelationshipCharacteristicList;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceRelationship serviceRelationship = (ServiceRelationship) o;
        return 
            Objects.equals(this.href, serviceRelationship.href) &&
            Objects.equals(this.id, serviceRelationship.id) &&
            Objects.equals(this.atBaseType, serviceRelationship.atBaseType) &&
            Objects.equals(this.atSchemaLocation, serviceRelationship.atSchemaLocation) &&
            Objects.equals(this.atType, serviceRelationship.atType) &&
            Objects.equals(this.relationshipType, serviceRelationship.relationshipType) &&
            Objects.equals(this.service, serviceRelationship.service) &&
            Objects.equals(this.serviceRelationshipCharacteristicList, serviceRelationship.serviceRelationshipCharacteristicList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, atBaseType, atSchemaLocation, atType, relationshipType, service, serviceRelationshipCharacteristicList);
    }

    @Override
    public String toString() {
        return "class ServiceRelationship {\n" +
        
                "    href: " + toIndentedString(href) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    atBaseType: " + toIndentedString(atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(atType) + "\n" +
                "    relationshipType: " + toIndentedString(relationshipType) + "\n" +
                "    service: " + toIndentedString(service) + "\n" +
                "    serviceRelationshipCharacteristicList: " + toIndentedString(serviceRelationshipCharacteristicList) + "\n" +
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