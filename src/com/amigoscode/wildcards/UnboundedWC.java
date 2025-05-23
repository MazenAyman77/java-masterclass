package com.amigoscode.wildcards;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UnboundedWC {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,5,6);
        print(list);
        List<String> list2 = Arrays.asList("ds","jhk","jhkn");
        print(list2);
        List<Object> list3 = Arrays.asList(1,new Date(),"kjhlkj");
        print(list3);

    }

    static void print(List<?> list){
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
