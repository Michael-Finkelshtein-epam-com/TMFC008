package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * RelatedServiceOrderItem (a ServiceOrder item) .The service order item which triggered service creation/change/termination.
 */
public class RelatedServiceOrderItem {
    
                
    private @Valid Object href;
    
                  
    private @Valid String id;
    
                
    private @Valid String atBaseType;
    
                
    private @Valid Object atSchemaLocation;
    
                
    private @Valid String atType;
    
                
    private @Valid String atReferredType;
    
        
    public enum ItemActionEnum {
            
        ADD(String.valueOf("add")),
            
        MODIFY(String.valueOf("modify")),
            
        DELETE(String.valueOf("delete")),
            
        NOCHANGE(String.valueOf("noChange"));
            
        private String value;

        
        ItemActionEnum (String v) {

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
                
        public static ItemActionEnum fromValue(String value) {   
            for ( ItemActionEnum b :  ItemActionEnum.values()) {
                if (Objects.equals(b.value, value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

            
    private @Valid ItemActionEnum itemAction;
    
                  
    private @Valid String itemId;
    
                  
    private @Valid String role;
    
                  
    private @Valid String serviceOrderHref;
    
                  
    private @Valid String serviceOrderId;
    

    
        
        


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
     * Action of the order item for this service
     */
    @JsonProperty("itemAction")
    public ItemActionEnum getItemAction() {
        return itemAction;
    }

    public void setItemAction(ItemActionEnum itemAction) {
        this.itemAction = itemAction;
    }
    
        
        


    /**
     * Identifier of the order item where the service was managed
     */
    @JsonProperty("itemId")@NotNull
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    
        
        


    /**
     * role of the service order item for this service
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
        
        


    /**
     * Reference of the related entity.
     */
    @JsonProperty("serviceOrderHref")
    public String getServiceOrderHref() {
        return serviceOrderHref;
    }

    public void setServiceOrderHref(String serviceOrderHref) {
        this.serviceOrderHref = serviceOrderHref;
    }
    
        
        


    /**
     * Unique identifier of a related entity.
     */
    @JsonProperty("serviceOrderId")@NotNull
    public String getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(String serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RelatedServiceOrderItem relatedServiceOrderItem = (RelatedServiceOrderItem) o;
        return 
            Objects.equals(this.href, relatedServiceOrderItem.href) &&
            Objects.equals(this.id, relatedServiceOrderItem.id) &&
            Objects.equals(this.atBaseType, relatedServiceOrderItem.atBaseType) &&
            Objects.equals(this.atSchemaLocation, relatedServiceOrderItem.atSchemaLocation) &&
            Objects.equals(this.atType, relatedServiceOrderItem.atType) &&
            Objects.equals(this.atReferredType, relatedServiceOrderItem.atReferredType) &&
            Objects.equals(this.itemAction, relatedServiceOrderItem.itemAction) &&
            Objects.equals(this.itemId, relatedServiceOrderItem.itemId) &&
            Objects.equals(this.role, relatedServiceOrderItem.role) &&
            Objects.equals(this.serviceOrderHref, relatedServiceOrderItem.serviceOrderHref) &&
            Objects.equals(this.serviceOrderId, relatedServiceOrderItem.serviceOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, atBaseType, atSchemaLocation, atType, atReferredType, itemAction, itemId, role, serviceOrderHref, serviceOrderId);
    }

    @Override
    public String toString() {
        return "class RelatedServiceOrderItem {\n" +
        
                "    href: " + toIndentedString(href) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    atBaseType: " + toIndentedString(atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(atType) + "\n" +
                "    atReferredType: " + toIndentedString(atReferredType) + "\n" +
                "    itemAction: " + toIndentedString(itemAction) + "\n" +
                "    itemId: " + toIndentedString(itemId) + "\n" +
                "    role: " + toIndentedString(role) + "\n" +
                "    serviceOrderHref: " + toIndentedString(serviceOrderHref) + "\n" +
                "    serviceOrderId: " + toIndentedString(serviceOrderId) + "\n" +
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