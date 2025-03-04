package com.ynova.hotel_service.exceptions;

public class ResourceNotFoudException extends RuntimeException {

    public ResourceNotFoudException(String message) {
        super(message);
    }

    public ResourceNotFoudException() {
        super("Recurso no encontrado");
    }

}
