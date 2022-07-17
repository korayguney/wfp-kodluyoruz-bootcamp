package dev.patika.patika06.exceptions;

public class CustomerNotExistsException extends RuntimeException{

    public CustomerNotExistsException(String message) {
        super(message);
    }

}
