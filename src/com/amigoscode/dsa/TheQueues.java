package com.amigoscode.dsa;

import com.amigoscode.classes.person.Gender;
import com.amigoscode.classes.person.Person;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueues {
    public static void main(String[] args) {

        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("ALI","aahmed", Gender.MALE));
        supermarket.add(new Person("mmostfa","saaad", Gender.MALE));
        supermarket.add(new Person("mazen","mohamed", Gender.MALE));
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());



    }
}
