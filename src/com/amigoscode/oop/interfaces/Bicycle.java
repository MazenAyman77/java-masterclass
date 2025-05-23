package com.amigoscode.oop.interfaces;

public class Bicycle implements Vehicle{
    private int currentSpeed;

    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Bicycle() {
    }

    @Override
    public void move(int speed){
        System.out.println("Pedal");
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
        return "Bicycle{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
