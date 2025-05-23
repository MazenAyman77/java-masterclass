package com.amigoscode.classes.car;

public class CarDAO {
    // here i'm assuming that i'm storing cars in an array than a database
    private static CarModel[] cars;
    private static int nextAvailableSlot =0 ;

    private static final int CAPACITY = 7;

    static {
        cars = new CarModel[CAPACITY];
    }

    public void saveCar(CarModel car){
        if (nextAvailableSlot +1 >= CAPACITY){
            // grow db
        }
        cars[nextAvailableSlot] = car;
        ++ nextAvailableSlot;
    }

    public CarModel[] selectAllCars(){
        return cars;
    }


}
