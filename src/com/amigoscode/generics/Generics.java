package com.amigoscode.generics;

public class Generics {

    public static void main(String[] args) {
        Box<Phone> box = new Box<>();
        box.set(new Phone("iphone"));
        System.out.println(box.get());

        String[] names = {"ali","ahmed","mazen"};
        Integer[] numbers = {2,5,3};
        print(names);
        print(numbers);
    }

    static <T> void print(T[] array){
        for (T t : array){
            System.out.println(
                    t.getClass().getName() +
                            " - " + t
            );
        }
    }

}
