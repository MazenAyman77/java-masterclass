package com.amigoscode.oop.abstractclasses;


public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makingSound() {
        System.out.println("Wof wof");
    }
}
