package com.amigoscode.oop.interfaces;

public class Car implements Vehicle {
    private int currentSpeed;

    public Car() {
    }

    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int speed){
        System.out.println("Start Engine");
        System.out.println("Accelerate");
        this.currentSpeed += speed;
    }

    @Override
    public void applyBreak(int speed){
        this.currentSpeed -= speed;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
