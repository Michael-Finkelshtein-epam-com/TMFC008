package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects; 

/**
 * Service is a base class for defining the Service hierarchy. All Services are characterized as either being possibly visible and usable by a Customer or not. This gives rise to the two subclasses of Service: CustomerFacingService and ResourceFacingService.
 */
public class Service {
    
                  
    private @Valid String href;
    
                  
    private @Valid String id;
    
                
    private @Valid String atBaseType;
    
                
    private @Valid Object atSchemaLocation;
    
                
    private @Valid String atType;
    
                  
    private @Valid String category;
    
                  
    private @Valid String description;
    
                
    private @Valid java.time.OffsetDateTime endDate;
    
    private @Valid List<Feature> featureList;
    
                  
    private @Valid Boolean hasStarted;
    
                  
    private @Valid Boolean isBundle;
    
                  
    private @Valid Boolean isServiceEnabled;
    
                  
    private @Valid Boolean isStateful;
    
                  
    private @Valid String name;
    
    private @Valid List<Note> noteList;
    
    private @Valid List<RelatedPlaceRefOrValue> placeList;
    
    private @Valid List<RelatedEntityRefOrValue> relatedEntityList;
    
    private @Valid List<RelatedParty> relatedPartyList;
    
    private @Valid List<Characteristic> serviceCharacteristicList;
    
                  
    private @Valid String serviceDate;
    
    private @Valid List<RelatedServiceOrderItem> serviceOrderItemList;
    
    private @Valid List<ServiceRelationship> serviceRelationshipList;
    
    private @Valid ServiceSpecificationRef serviceSpecification;
    
                  
    private @Valid String serviceType;
    
                
    private @Valid java.time.OffsetDateTime startDate;
    
                  
    private @Valid String startMode;
    
        
    public enum StateEnum {
            
        FEASIBILITYCHECKED(String.valueOf("feasibilityChecked")),
            
        DESIGNED(String.valueOf("designed")),
            
        RESERVED(String.valueOf("reserved")),
            
        INACTIVE(String.valueOf("inactive")),
            
        ACTIVE(String.valueOf("active")),
            
        TERMINATED(String.valueOf("terminated"));
            
        private String value;

        
        StateEnum (String v) {

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
                
        public static StateEnum fromValue(String value) {   
            for ( StateEnum b :  StateEnum.values()) {
                if (Objects.equals(b.value, value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

            
    private @Valid StateEnum state;
    
    private @Valid List<ResourceRef> supportingResourceList;
    
    private @Valid List<ServiceRefOrValue> supportingServiceList;
    

    
        
        


    /**
     * Reference of the service
     */
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
    
        
        


    /**
     * Unique identifier of the service
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
     * Is it a customer facing or resource facing service
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
        
        


    /**
     * Free-text description of the service
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
        
        


    /**
     * Date when the service ends
     */
    @JsonProperty("endDate")
    public java.time.OffsetDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(java.time.OffsetDateTime endDate) {
        this.endDate = endDate;
    }
    
        
        


    /**
     * A list of feature associated with this service 
     */
    @JsonProperty("feature")
    public List<Feature> getFeature() {
        return featureList;
    }

    public void setFeature(List<Feature> featureList) {
        this.featureList = featureList;
    }
    
        
        


    /**
     * If TRUE, this Service has already been started
     */
    @JsonProperty("hasStarted")
    public Boolean getHasStarted() {
        return hasStarted;
    }

    public void setHasStarted(Boolean hasStarted) {
        this.hasStarted = hasStarted;
    }
    
        
        


    /**
     * If true, the service is a ServiceBundle which regroup a service hierachy. If false, the service is a 'atomic' service (hierachy leaf).
     */
    @JsonProperty("isBundle")
    public Boolean getIsBundle() {
        return isBundle;
    }

    public void setIsBundle(Boolean isBundle) {
        this.isBundle = isBundle;
    }
    
        
        


    /**
     * If FALSE and hasStarted is FALSE, this particular Service has NOT been enabled for use - if FALSE and hasStarted is TRUE then the service has failed 
     */
    @JsonProperty("isServiceEnabled")
    public Boolean getIsServiceEnabled() {
        return isServiceEnabled;
    }

    public void setIsServiceEnabled(Boolean isServiceEnabled) {
        this.isServiceEnabled = isServiceEnabled;
    }
    
        
        


    /**
     * If TRUE, this Service can be changed without affecting any other services
     */
    @JsonProperty("isStateful")
    public Boolean getIsStateful() {
        return isStateful;
    }

    public void setIsStateful(Boolean isStateful) {
        this.isStateful = isStateful;
    }
    
        
        


    /**
     * Name of the service
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        
        


    /**
     * A list of notes made on this service
     */
    @JsonProperty("note")
    public List<Note> getNote() {
        return noteList;
    }

    public void setNote(List<Note> noteList) {
        this.noteList = noteList;
    }
    
        
        


    /**
     * A list of places (Place [*]). Used to define a place useful for the service (for example a geographical place whre the service is installed)
     */
    @JsonProperty("place")
    public List<RelatedPlaceRefOrValue> getPlace() {
        return placeList;
    }

    public void setPlace(List<RelatedPlaceRefOrValue> placeList) {
        this.placeList = placeList;
    }
    
        
        


    /**
     * A list of related  entity in relationship with this service 
     */
    @JsonProperty("relatedEntity")
    public List<RelatedEntityRefOrValue> getRelatedEntity() {
        return relatedEntityList;
    }

    public void setRelatedEntity(List<RelatedEntityRefOrValue> relatedEntityList) {
        this.relatedEntityList = relatedEntityList;
    }
    
        
        


    /**
     * A list of related party references (RelatedParty [*]). A related party defines party or party role linked to a specific entity
     */
    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedPartyList;
    }

    public void setRelatedParty(List<RelatedParty> relatedPartyList) {
        this.relatedPartyList = relatedPartyList;
    }
    
        
        


    /**
     * A list of characteristics that characterize this service (ServiceCharacteristic [*]) 
     */
    @JsonProperty("serviceCharacteristic")
    public List<Characteristic> getServiceCharacteristic() {
        return serviceCharacteristicList;
    }

    public void setServiceCharacteristic(List<Characteristic> serviceCharacteristicList) {
        this.serviceCharacteristicList = serviceCharacteristicList;
    }
    
        
        


    /**
     * Date when the service was created (whatever its status).
     */
    @JsonProperty("serviceDate")
    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }
    
        
        


    /**
     * A list of service order items related to this service
     */
    @JsonProperty("serviceOrderItem")
    public List<RelatedServiceOrderItem> getServiceOrderItem() {
        return serviceOrderItemList;
    }

    public void setServiceOrderItem(List<RelatedServiceOrderItem> serviceOrderItemList) {
        this.serviceOrderItemList = serviceOrderItemList;
    }
    
        
        


    /**
     * A list of service relationships (ServiceRelationship [*]). Describes links with other service(s) in the inventory.
     */
    @JsonProperty("serviceRelationship")
    public List<ServiceRelationship> getServiceRelationship() {
        return serviceRelationshipList;
    }

    public void setServiceRelationship(List<ServiceRelationship> serviceRelationshipList) {
        this.serviceRelationshipList = serviceRelationshipList;
    }
    
        
        


    /**
     * The specification from which this service was instantiated
     */
    @JsonProperty("serviceSpecification")
    public ServiceSpecificationRef getServiceSpecification() {
        return serviceSpecification;
    }

    public void setServiceSpecification(ServiceSpecificationRef serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
    }
    
        
        


    /**
     * Business type of the service
     */
    @JsonProperty("serviceType")
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    
        
        


    /**
     * Date when the service starts
     */
    @JsonProperty("startDate")
    public java.time.OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(java.time.OffsetDateTime startDate) {
        this.startDate = startDate;
    }
    
        
        


    /**
     * This attribute is an enumerated integer that indicates how the Service is started, such as: 0: Unknown; 1: Automatically by the managed environment; 2: Automatically by the owning device; 3: Manually by the Provider of the Service; 4: Manually by a Customer of the Provider; 5: Any of the above
     */
    @JsonProperty("startMode")
    public String getStartMode() {
        return startMode;
    }

    public void setStartMode(String startMode) {
        this.startMode = startMode;
    }
    
        
        


    /**
     * The life cycle state of the service, such as designed, reserved, active, etc...
     */
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }
    
        
        


    /**
     * A list of supporting resources (SupportingResource [*]).Note: only Service of type RFS can be associated with Resources
     */
    @JsonProperty("supportingResource")
    public List<ResourceRef> getSupportingResource() {
        return supportingResourceList;
    }

    public void setSupportingResource(List<ResourceRef> supportingResourceList) {
        this.supportingResourceList = supportingResourceList;
    }
    
        
        


    /**
     * A list of supporting services (SupportingService [*]). A collection of services that support this service (bundling, link CFS to RFS)
     */
    @JsonProperty("supportingService")
    public List<ServiceRefOrValue> getSupportingService() {
        return supportingServiceList;
    }

    public void setSupportingService(List<ServiceRefOrValue> supportingServiceList) {
        this.supportingServiceList = supportingServiceList;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Service service = (Service) o;
        return 
            Objects.equals(this.href, service.href) &&
            Objects.equals(this.id, service.id) &&
            Objects.equals(this.atBaseType, service.atBaseType) &&
            Objects.equals(this.atSchemaLocation, service.atSchemaLocation) &&
            Objects.equals(this.atType, service.atType) &&
            Objects.equals(this.category, service.category) &&
            Objects.equals(this.description, service.description) &&
            Objects.equals(this.endDate, service.endDate) &&
            Objects.equals(this.featureList, service.featureList) &&
            Objects.equals(this.hasStarted, service.hasStarted) &&
            Objects.equals(this.isBundle, service.isBundle) &&
            Objects.equals(this.isServiceEnabled, service.isServiceEnabled) &&
            Objects.equals(this.isStateful, service.isStateful) &&
            Objects.equals(this.name, service.name) &&
            Objects.equals(this.noteList, service.noteList) &&
            Objects.equals(this.placeList, service.placeList) &&
            Objects.equals(this.relatedEntityList, service.relatedEntityList) &&
            Objects.equals(this.relatedPartyList, service.relatedPartyList) &&
            Objects.equals(this.serviceCharacteristicList, service.serviceCharacteristicList) &&
            Objects.equals(this.serviceDate, service.serviceDate) &&
            Objects.equals(this.serviceOrderItemList, service.serviceOrderItemList) &&
            Objects.equals(this.serviceRelationshipList, service.serviceRelationshipList) &&
            Objects.equals(this.serviceSpecification, service.serviceSpecification) &&
            Objects.equals(this.serviceType, service.serviceType) &&
            Objects.equals(this.startDate, service.startDate) &&
            Objects.equals(this.startMode, service.startMode) &&
            Objects.equals(this.state, service.state) &&
            Objects.equals(this.supportingResourceList, service.supportingResourceList) &&
            Objects.equals(this.supportingServiceList, service.supportingServiceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, atBaseType, atSchemaLocation, atType, category, description, endDate, featureList, hasStarted, isBundle, isServiceEnabled, isStateful, name, noteList, placeList, relatedEntityList, relatedPartyList, serviceCharacteristicList, serviceDate, serviceOrderItemList, serviceRelationshipList, serviceSpecification, serviceType, startDate, startMode, state, supportingResourceList, supportingServiceList);
    }

    @Override
    public String toString() {
        return "class Service {\n" +
        
                "    href: " + toIndentedString(href) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    atBaseType: " + toIndentedString(atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(atType) + "\n" +
                "    category: " + toIndentedString(category) + "\n" +
                "    description: " + toIndentedString(description) + "\n" +
                "    endDate: " + toIndentedString(endDate) + "\n" +
                "    featureList: " + toIndentedString(featureList) + "\n" +
                "    hasStarted: " + toIndentedString(hasStarted) + "\n" +
                "    isBundle: " + toIndentedString(isBundle) + "\n" +
                "    isServiceEnabled: " + toIndentedString(isServiceEnabled) + "\n" +
                "    isStateful: " + toIndentedString(isStateful) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    noteList: " + toIndentedString(noteList) + "\n" +
                "    placeList: " + toIndentedString(placeList) + "\n" +
                "    relatedEntityList: " + toIndentedString(relatedEntityList) + "\n" +
                "    relatedPartyList: " + toIndentedString(relatedPartyList) + "\n" +
                "    serviceCharacteristicList: " + toIndentedString(serviceCharacteristicList) + "\n" +
                "    serviceDate: " + toIndentedString(serviceDate) + "\n" +
                "    serviceOrderItemList: " + toIndentedString(serviceOrderItemList) + "\n" +
                "    serviceRelationshipList: " + toIndentedString(serviceRelationshipList) + "\n" +
                "    serviceSpecification: " + toIndentedString(serviceSpecification) + "\n" +
                "    serviceType: " + toIndentedString(serviceType) + "\n" +
                "    startDate: " + toIndentedString(startDate) + "\n" +
                "    startMode: " + toIndentedString(startMode) + "\n" +
                "    state: " + toIndentedString(state) + "\n" +
                "    supportingResourceList: " + toIndentedString(supportingResourceList) + "\n" +
                "    supportingServiceList: " + toIndentedString(supportingServiceList) + "\n" +
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