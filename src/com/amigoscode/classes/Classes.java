package com.amigoscode.classes;

import com.amigoscode.classes.car.Brand;
import com.amigoscode.classes.car.CarModel;
import com.amigoscode.classes.car.CarService;
import com.amigoscode.classes.cats.CatObject;
import com.amigoscode.classes.person.Gender;
import com.amigoscode.classes.person.Person;

import java.math.BigDecimal;
import java.util.Arrays;

import static java.lang.Math.max;

public class Classes {
    public static void main(String[] args) {
        CatObject rose = new CatObject("rose", 1);
        // rose.setName("Rose");
        rose.meow();

        CatObject sara = new CatObject("sara");
        sara.meow();
        System.out.println("cat name : " + sara.getName());
        System.out.println(sara);
        System.out.println(sara.equals(rose));
        System.out.println();

        Person ahmed = new Person("ahmed","kamel", Gender.MALE);
        Person khaled = new Person("khaled","aly",Gender.MALE);
        System.out.println(Person.count);
        System.out.println();

        // here i used max only not Math.max as usual cuz i used static imports in the seventh line
        System.out.println(max(10,20));
        System.out.println();

        CarModel car = new CarModel(2077, BigDecimal.valueOf(807_000), Brand.BMW);
        CarService carService = new CarService();
        carService.registerCar(car);
        System.out.println(Arrays.toString(carService.getCars()));
        // output is one car and the rest are nulls cuz we registered only one car

    }


}
