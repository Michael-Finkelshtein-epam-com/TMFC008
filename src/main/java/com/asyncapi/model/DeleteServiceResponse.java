package com.asyncapi.model;

import javax.validation.Valid;

import java.util.Objects;
import java.util.List;


public class DeleteServiceResponse {
    public interface OneOfDeleteServiceDeletedBadRequestResponseUnauthorizedResponseForbiddenResponseNotFoundResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse {

    }
    private @Valid OneOfDeleteServiceDeletedBadRequestResponseUnauthorizedResponseForbiddenResponseNotFoundResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse payload;

    public OneOfDeleteServiceDeletedBadRequestResponseUnauthorizedResponseForbiddenResponseNotFoundResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse getPayload() {
        return payload;
    }

    public void setPayload(OneOfDeleteServiceDeletedBadRequestResponseUnauthorizedResponseForbiddenResponseNotFoundResponseMethodNotAllowedResponseConflictResponseInternalServerErrorResponse payload) {
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
        DeleteServiceResponse event = (DeleteServiceResponse) o;
        return Objects.equals(this.payload, event.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload);
    }

    @Override
    public String toString() {
        return "class DeleteServiceResponse {\n" +
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