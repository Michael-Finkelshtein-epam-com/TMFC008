package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * Extra information about a given entity
 */
public class Note {
    
                
    private @Valid String atBaseType;
    
                
    private @Valid Object atSchemaLocation;
    
                
    private @Valid String atType;
    
                  
    private @Valid String author;
    
                
    private @Valid java.time.OffsetDateTime date;
    
                  
    private @Valid String id;
    
                  
    private @Valid String text;
    

    
        
        


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
     * Author of the note
     */
    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
        
        


    /**
     * Date of the note
     */
    @JsonProperty("date")
    public java.time.OffsetDateTime getDate() {
        return date;
    }

    public void setDate(java.time.OffsetDateTime date) {
        this.date = date;
    }
    
        
        


    /**
     * Identifier of the note within its containing entity
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
        
        


    /**
     * Text of the note
     */
    @JsonProperty("text")@NotNull
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Note note = (Note) o;
        return 
            Objects.equals(this.atBaseType, note.atBaseType) &&
            Objects.equals(this.atSchemaLocation, note.atSchemaLocation) &&
            Objects.equals(this.atType, note.atType) &&
            Objects.equals(this.author, note.author) &&
            Objects.equals(this.date, note.date) &&
            Objects.equals(this.id, note.id) &&
            Objects.equals(this.text, note.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atBaseType, atSchemaLocation, atType, author, date, id, text);
    }

    @Override
    public String toString() {
        return "class Note {\n" +
        
                "    atBaseType: " + toIndentedString(atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(atType) + "\n" +
                "    author: " + toIndentedString(author) + "\n" +
                "    date: " + toIndentedString(date) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    text: " + toIndentedString(text) + "\n" +
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