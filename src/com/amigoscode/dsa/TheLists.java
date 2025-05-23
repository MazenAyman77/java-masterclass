package com.amigoscode.dsa;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("purplele");
        colors.add("yellow");

        System.out.println(colors);

        for (String color : colors) {
            System.out.println(color);
        }


    }
}
