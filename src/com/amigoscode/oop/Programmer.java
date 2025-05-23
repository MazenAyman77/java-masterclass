package com.amigoscode.oop;

import java.math.BigDecimal;
import java.util.Arrays;

public class Programmer extends Employee {
    private String[] progLangs;

    public Programmer(String name, String address, BigDecimal salary, String[] progLangs) {
        super(name, address, salary);
        this.progLangs = progLangs;
    }

    public String[] getProgLangs() {
        return progLangs;
    }

    public void setProgLangs(String[] progLangs) {
        this.progLangs = progLangs;
    }

    public void writingCode(){
        super.sayhi();
        System.out.println("writing some code");
    }

    // overriding the methode say hi in employee
    @Override
    public void sayhi() {
        System.out.println("hello my name is " + this.name);
        System.out.println("I'm a programmer");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "progLangs=" + Arrays.toString(progLangs) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programmer that = (Programmer) o;
        return Arrays.equals(progLangs, that.progLangs);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(progLangs);
        return result;
    }
}
