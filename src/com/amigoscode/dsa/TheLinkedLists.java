package com.amigoscode.dsa;

import com.amigoscode.classes.person.Gender;
import com.amigoscode.classes.person.Person;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedLists {
    public static void main(String[] args) {
        LinkedList<Person> personList = new LinkedList<>();
        personList.add(new Person("Ali","Khaled", Gender.MALE));
        personList.add(new Person("mazen","hosssam", Gender.MALE));
        personList.add(new Person("tarek","zayeed", Gender.MALE));

        ListIterator<Person> listIterator = personList.listIterator();
        // looks forward
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        // looks backward
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.next());
        }



    }
}
