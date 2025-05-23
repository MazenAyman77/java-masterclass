package com.amigoscode.generics;

public class Phone {
    private final String BRAND;

    public Phone(String brand) {
        BRAND = brand;
    }

    @Override
    public String toString() {
        return "phone{" +
                "BRAND='" + BRAND + '\'' +
                '}';
    }
}
