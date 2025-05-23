package com.amigoscode.oop.interfaces;

public interface Vehicle {
    // constants
    // abstract methods
    // default methods

    // abstract methods
        // here i didnt say public abstract as they are in default abstract methods
    void move(int speed);

    void applyBreak(int speed);

    int getCurrentSpeed();

    // constants
        // here i didnt say public final or private static final or public static as they are in default constants
    double PURCHASERATE = 0.5;

    // default methods
    default double milesToKm(){
        return getCurrentSpeed()*(1.608);
    }

}
