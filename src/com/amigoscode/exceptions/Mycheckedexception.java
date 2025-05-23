package com.amigoscode.exceptions;

public class Mycheckedexception extends Exception {

    public Mycheckedexception(String message) {
        // ability for us to pass a message into our exception
        super(message);
    }
}
