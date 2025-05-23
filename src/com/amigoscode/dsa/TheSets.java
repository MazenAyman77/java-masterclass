package com.amigoscode.dsa;

import com.amigoscode.classes.person.Gender;
import com.amigoscode.classes.person.Person;

import java.util.HashSet;
import java.util.Set;

public class TheSets {
    public static void main(String[] args) {
        Set<Person> personsSet = new HashSet<>();
        personsSet.add(new Person("Ali","Khaled", Gender.MALE));
        personsSet.add(new Person("mazen","hosssam", Gender.MALE));
        personsSet.add(new Person("tarek","zayeed", Gender.MALE));

        System.out.println(personsSet.size());
        personsSet.forEach(System.out::println);
        personsSet.remove(new Person("mazen","hosssam", Gender.MALE));
        System.out.println(personsSet.size());


    }
}
