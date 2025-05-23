package com.amigoscode.oop.interfaces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // polymorphism = many forms
            // car : move, getCurrentSpeed, break
            // bicycle : move, getCurrentSpeed, break
            // electric scooter : move, getCurrentSpeed, break

        // since those methods have the same name, they dont have the same functionality, so instead of making a class
        // called vehicles and but all the methods in it, we use interfaces.

        Car car = new Car(0);
        Bicycle bicycle = new Bicycle(0);
        Vehicle[] vehicles = {car, bicycle};
        Person john = new Person("John", vehicles);

        car.move(15);

        Vehicle[] johnVehicles = john.getVehicles();
        System.out.println(Arrays.toString(johnVehicles));

    }
}
