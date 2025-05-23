package com.amigoscode.exceptions;

import java.util.Optional;

public class NullPointerException {

    public static void main(String[] args) {
        // String brand = "amigos code";
        String brand = null;
        // we know that brand might or might not be null
        Optional<String> brandOptional = Optional.ofNullable(brand); // type of optional is string
        System.out.println(brandOptional.isPresent());
        if (brandOptional.isPresent()){
            System.out.println(brandOptional.get());
        }else {
            System.out.println("brand is empty");
        }

    }

}
