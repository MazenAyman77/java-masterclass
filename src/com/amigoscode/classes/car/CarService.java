package com.amigoscode.classes.car;

public class CarService {

    private CarDAO carDAO;

    public CarService() {
        this.carDAO = new CarDAO();
    }

    public int registerCar(CarModel car){
        if (car == null){
            throw new IllegalArgumentException("car cant be null");
        }
        // check if reg number is valid
        // check if reg number is not taken ...etc

        carDAO.saveCar(car);

        return 1;
    }

    public CarModel[] getCars(){
        return carDAO.selectAllCars();
    }
}
