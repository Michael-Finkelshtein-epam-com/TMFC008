package com.asyncapi.model;

import javax.validation.Valid;

import java.util.Objects;
import java.util.List;


public class CreateServiceResponse {
    public interface OneOfCreateServiceCreatedBadRequestResponseUnauthorizedResponseForbiddenResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse {

    }
    private @Valid OneOfCreateServiceCreatedBadRequestResponseUnauthorizedResponseForbiddenResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse payload;

    public OneOfCreateServiceCreatedBadRequestResponseUnauthorizedResponseForbiddenResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse getPayload() {
        return payload;
    }

    public void setPayload(OneOfCreateServiceCreatedBadRequestResponseUnauthorizedResponseForbiddenResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse payload) {
        this.payload = payload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateServiceResponse event = (CreateServiceResponse) o;
        return Objects.equals(this.payload, event.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload);
    }

    @Override
    public String toString() {
        return "class CreateServiceResponse {\n" +
                "    payload: " + toIndentedString(payload) + "\n" +
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