package com.amigoscode.oop;

import com.amigoscode.oop.abstractclasses.Animal;
import com.amigoscode.oop.abstractclasses.Cat;
import com.amigoscode.oop.abstractclasses.Dog;
import com.amigoscode.oop.abstractclasses.NumberExtractor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Dog dog1 = new Dog("foo");
        Animal dog2 = new Dog("doggo");
        Animal cat1 = new Cat("bar");

        new NumberExtractor().prepareAndSendReport("src/fooso.txt");
    }
}
