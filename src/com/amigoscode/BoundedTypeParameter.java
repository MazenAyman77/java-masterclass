package com.amigoscode;

public class BoundedTypeParameter {
    public static void main(String[] args) {

        Integer[] numbers = {1,6,3,4,8};
        System.out.println(greaterCompare(numbers,3));
        Double[] numbers3 = {3.6,6.8,1.3};
        System.out.println(greaterCompare(numbers3,4.2));

    }
    static <T extends Comparable<T>> int greaterCompare(T[] numbers, T number){
        int counter = 0;
        for (T t : numbers) {
            if (t.compareTo(number) > 0){
                counter++;
            }
        }
        return counter;
    }
}
