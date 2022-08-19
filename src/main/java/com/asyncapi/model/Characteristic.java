package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * Describes a given characteristic of an object or entity through a name/value pair.
 */
public class Characteristic {
    
                
    private @Valid String atBaseType;
    
                
    private @Valid Object atSchemaLocation;
    
                
    private @Valid String atType;
    
    private @Valid List<CharacteristicRelationship> characteristicRelationshipList;
    
                  
    private @Valid String id;
    
                  
    private @Valid String name;
    
                  
    private @Valid Object value;
    
                  
    private @Valid String valueType;
    

    
        
        


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
    
        
        


    
    @JsonProperty("characteristicRelationship")
    public List<CharacteristicRelationship> getCharacteristicRelationship() {
        return characteristicRelationshipList;
    }

    public void setCharacteristicRelationship(List<CharacteristicRelationship> characteristicRelationshipList) {
        this.characteristicRelationshipList = characteristicRelationshipList;
    }
    
        
        


    /**
     * Unique identifier of the characteristic
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
        
        


    /**
     * Name of the characteristic
     */
    @JsonProperty("name")@NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        
        


    /**
     * The value of the characteristic
     */
    @JsonProperty("value")@NotNull
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    
        
        


    /**
     * Data type of the value of the characteristic
     */
    @JsonProperty("valueType")
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Characteristic characteristic = (Characteristic) o;
        return 
            Objects.equals(this.atBaseType, characteristic.atBaseType) &&
            Objects.equals(this.atSchemaLocation, characteristic.atSchemaLocation) &&
            Objects.equals(this.atType, characteristic.atType) &&
            Objects.equals(this.characteristicRelationshipList, characteristic.characteristicRelationshipList) &&
            Objects.equals(this.id, characteristic.id) &&
            Objects.equals(this.name, characteristic.name) &&
            Objects.equals(this.value, characteristic.value) &&
            Objects.equals(this.valueType, characteristic.valueType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atBaseType, atSchemaLocation, atType, characteristicRelationshipList, id, name, value, valueType);
    }

    @Override
    public String toString() {
        return "class Characteristic {\n" +
        
                "    atBaseType: " + toIndentedString(atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(atType) + "\n" +
                "    characteristicRelationshipList: " + toIndentedString(characteristicRelationshipList) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    value: " + toIndentedString(value) + "\n" +
                "    valueType: " + toIndentedString(valueType) + "\n" +
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