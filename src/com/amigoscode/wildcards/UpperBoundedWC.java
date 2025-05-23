package com.amigoscode.wildcards;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UpperBoundedWC {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,5,6);
        print(list);
        List<Double> list2 = Arrays.asList(3.4,.6,7.77);
        print(list2);
        List<Number> list3 = Arrays.asList();
        print(list3);

    }

    // make restrictions to only accept numbers (int float double)
    static void print(List<? extends Number> list){
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }

}
