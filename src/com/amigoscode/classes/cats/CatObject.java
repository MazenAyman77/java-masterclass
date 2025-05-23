package com.amigoscode.classes.cats;

import java.util.Objects;

public class CatObject {
    private String name;
    private double age;

    public CatObject(String name, int age){
        this.name = name;
        this.age = age;
    }

    public CatObject(String name){
        this.name = name;
        this.age = 1.5;
    }


    public CatObject(){}

    public void meow() {
        System.out.println(name + ": Meow");
    }

    public void setName(String catName) {
        this.name = catName;
    }

    public String getName(){
        return this.name;
    }

    // every time we print an object this is the string representation
//    public String toString(){
//        return "Name: " + name + " , Age: "+ age;
//    }

    // or you can just type toString and a panel will open for you select the toString method and voalaa
    @Override // <== this is for readability, its best practice to write this in your code whenever you override a method in your class
    public String toString() {
        return "CatObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // methods for comparing objects
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass() /*here we say if the classes of the objects are not the same then false */)
            return false;
        // after we sure that they are both from the same class then we cast it
        CatObject catObject = (CatObject) o;
        return Double.compare(catObject.age, age) == 0 &&
                Objects.equals(name, catObject.name);
    }
    // whenever you override .equals you should override hashcode
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
