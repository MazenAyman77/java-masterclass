package com.amigoscode.streams;

import java.util.ArrayList;
import java.util.List;

public class Mockdata {

    public static List<People> getData() {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People("ahmed", 15, "MALE"));
        peopleList.add(new People("mohamed", 18, "MALE"));
        peopleList.add(new People("maged", 2, "MALE"));
        peopleList.add(new People("marwa", 8, "FEMALE"));
        peopleList.add(new People("mariam", 12, "FEMALE"));
        peopleList.add(new People("yara", 22, "FEMALE"));
        peopleList.add(new People("mazen", 30, "MALE"));
        peopleList.add(new People("mohamed", 45, "MALE"));
        peopleList.add(new People("mona", 7, "FEMALE"));
        peopleList.add(new People("nour", 10, "FEMALE"));
        peopleList.add(new People("maybelle", 2, "FEMALE"));
        peopleList.add(new People("karma", 1, "FEMALE"));
        peopleList.add(new People("mark", 8, "MALE"));
        peopleList.add(new People("john", 5, "MALE"));
        peopleList.add(new People("george", 18, "MALE"));
        return peopleList;
    }

}
