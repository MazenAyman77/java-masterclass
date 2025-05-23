package com.amigoscode.exceptions;

public class Myuncheckedexception extends RuntimeException {

    public Myuncheckedexception(String message) {
        // ability for us to pass a message into our exception
        super(message);
    }
}
