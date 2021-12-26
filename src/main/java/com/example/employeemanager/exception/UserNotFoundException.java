package com.example.employeemanager.exception;

/**
 * Created by adam on 2021. 12. 26.
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
