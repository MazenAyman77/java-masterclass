package com.amigoscode.oop.interfaces;

public class ElectricScooter implements Vehicle {
    private int currentSpeed;

    public ElectricScooter(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public ElectricScooter() {
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
        return "ElectricScooter{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
