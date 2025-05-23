package com.amigoscode.classes.car;

import java.io.Serializable;
import java.math.BigDecimal;

// learning about java beans
public class CarModel implements Serializable {
    // 1- class must have no arg constructor
    // 2- all the properties must be private
    // 3- class should implement Serializable #any class which implements serializable means that this class can be stored to a disk or
    // to a file ie. objects can be written into streams: files, data bases

    private int carPlateNumber;
    private BigDecimal price;
    private Brand brand;

    public CarModel() {
    }

    public CarModel(int carPlateNumber, BigDecimal price, Brand brand) {
        this.carPlateNumber = carPlateNumber;
        this.price = price;
        this.brand = brand;
    }

    public int getCarPlateNumber() {
        return carPlateNumber;
    }

    public void setCarPlateNumber(int carPlateNumber) {
        this.carPlateNumber = carPlateNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Brand getBrand() { return brand; }

    @Override
    public String toString() {
        return "CarModel{" +
                "carPlateNumber=" + carPlateNumber +
                ", price=" + price +
                ", brand=" + brand +
                '}';
    }
}
