package com.amigoscode.classes.person;

import com.amigoscode.classes.cats.CatObject;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    public static int count;
    private String fname;
    private String lname;
    private Gender gender;
    private CatObject[] cats;

    // static blocks executes whenever the class is called or an instance is constructed, mainly used in connection roles or database
    // for loading configuration files or initializing static resources, its executed one time only once the class is invoked
    static {
        System.out.println("start: static initialization");
        count = 0;
        System.out.println("end: static initialization");
    }

    // instance block executed each time an instance is constructed, before the constructor executes, Perform object-specific
    // setup before constructor logic, usually used when there is multiple constructors
    {
        System.out.println("instance block initialization");
        count ++;
    }

    public Person(String fname, String lname, Gender gender, CatObject[] cats) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.cats = cats;
    }

    public Person(String fname, String lname, Gender gender) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", gender=" + gender +
                ", cats=" + Arrays.toString(cats) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fname, person.fname) &&
                Objects.equals(lname, person.lname) &&
                gender == person.gender &&
                Arrays.equals(cats, person.cats);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fname, lname, gender);
        result = 31 * result + Arrays.hashCode(cats);
        return result;
    }
}
