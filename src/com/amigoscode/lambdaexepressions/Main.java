package com.amigoscode.lambdaexepressions;

public class Main {

    public static void main(String[] args) {

        // functional interface
//        A obj = new A(){
//            @Override
//            public void show() {
//                System.out.println("hello");
//            }
//        };

//        A obj = (i) -> System.out.println("hello" + " " + i);

        A obj = (x, y) -> x + y ;

        System.out.println(obj.add(5, 6));

    }

}
