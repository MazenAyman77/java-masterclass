package com.amigoscode.oop.abstractclasses;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makingSound() {
        System.out.println("Meaaao");
    }
}
