package org.example.digimon.exceptions;

public class AppException extends RuntimeException {

    public AppException() {
    }

    public AppException(String errorMessage) {
        super(errorMessage);
    }

}