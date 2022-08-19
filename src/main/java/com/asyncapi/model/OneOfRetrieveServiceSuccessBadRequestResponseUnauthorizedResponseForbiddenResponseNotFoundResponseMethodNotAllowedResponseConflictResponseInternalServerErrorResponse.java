
package com.asyncapi.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME, 
    include = JsonTypeInfo.As.PROPERTY, 
    property = "statusCode",
    visible = true)
    @JsonSubTypes({
@Type(value=RetrieveServiceSuccess.class),
@Type(value=BadRequestResponse.class),
@Type(value=UnauthorizedResponse.class),
@Type(value=ForbiddenResponse.class),
@Type(value=NotFoundResponse.class),
@Type(value=MethodNotAllowedResponse.class),
@Type(value=ConflictResponse.class),
@Type(value=InternalServerErrorResponse.class),
 })
public abstract interface OneOfRetrieveServiceSuccessBadRequestResponseUnauthorizedResponseForbiddenResponseNotFoundResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse {
}