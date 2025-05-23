package com.amigoscode.dsa;

import com.amigoscode.classes.person.Gender;
import com.amigoscode.classes.person.Person;
import com.amigoscode.oop.abstractclasses.Cat;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {
        // key then value
        Map<Person, Cat> objetMap = new HashMap<>();
        objetMap.put(new Person("mazen","hosssam", Gender.MALE), new Cat("BOSY"));
        System.out.println(objetMap.keySet());
        System.out.println(objetMap.entrySet());

    }

    // I have extracted this so i can write another code and test it
    private static void maps() {
        // the key is integer, while the value  is person
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person("addas", "adad", Gender.MALE));
        personMap.put(2, new Person("dfggg", "ads", Gender.MALE));
        personMap.put(3, new Person("hdf", "dfgd", Gender.MALE));

        System.out.println(personMap.containsKey(4));
        System.out.println(personMap.entrySet());
        System.out.println(personMap.get(2));
        System.out.println(personMap.size());
        System.out.println(personMap.keySet());

        personMap.entrySet().
                forEach(integerPersonEntry -> System.out.println(integerPersonEntry.getKey() + " " + integerPersonEntry.getValue()));

        personMap.forEach((key,person) -> {
            System.out.println(person);
        });
    }
}
