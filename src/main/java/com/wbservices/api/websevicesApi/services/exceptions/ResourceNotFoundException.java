package com.wbservices.api.websevicesApi.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Resouce not found. id " + id);
    }
}
