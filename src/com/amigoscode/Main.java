package com.amigoscode;

// imported automatically when i used Point method
import com.amigoscode.classes.person.Gender;

import java.awt.Point;

// imported automatically when i used Arrays.toString() method
import java.util.Arrays;

public class Main {

    private static int add(int n1, int n2) {
        return n1 + n2;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static double rentalYieldClaculator(double monthlyRentalIncome, double propertyPrice) {
        return ((monthlyRentalIncome * 12) / propertyPrice) * 100;
    }

    // for constants, this is a global variable
    public static final String LEGEND = "Mohamed";

    public static void main(String[] args) {
        // write your code here
        System.out.println("hello java");
        System.out.println(20 + 2);
        System.out.println("///////////////////////////////////////////////////////");
        // underscores does not affect the value
        int amount = 1_000_1515;

        /////////////////////////////////////////////////////////////
        System.out.println("  ".isEmpty());
        // to remove white spaces
        System.out.println(" s ".trim());
        System.out.println("amigoscode".substring(4, 7));
        System.out.println("/////////////////////////////////////////////////////// refrence types / objects");
        /////////////////////////////////////////////////////////////
        // refrence types / pbjects
        Point pointA = new Point(10, 10);
        System.out.println("pointA = " + pointA);
        pointA.move(11, 10);
        System.out.println("pointA = " + pointA);
        String a = "adm";
        System.out.println("/////////////////////////////////////////////////////// arrays");
        ////////////////////////////////////////////////////////////////
        // Arrays
        int[] numbers = new int[10];
        numbers[0] = 12;
        numbers[1] = 33;
        numbers[2] = 45;
        // the rest of the values are going to be zeros
        System.out.println(Arrays.toString(numbers));
        int[] numbers2 = {23, 45, 2423, 12};
        System.out.println(numbers2.length);
        double[] numbers3 = {1231, 2156, 1.23, 1.4589952};
        System.out.println(Arrays.toString(numbers3));
        String[] names = {"mazen", "mohamed", "kolo muani", "sadio"};
        System.out.println(Arrays.toString(names));
        int[] numbers4 = new int[3];
        Arrays.fill(numbers4, -1);
        numbers4[2] = 999;
        System.out.println(Arrays.toString(numbers4));
        String[] names2 = new String[3];
        names2[1] = "mohamed";
        // the rest of the values are going to be nulls
        System.out.println(Arrays.toString(names2));
        Arrays.fill(names2, "foo");
        System.out.println(Arrays.toString(names2));
        System.out.println("/////////////////////////////////////////////////////// loops");
        ////////////////////////////////////////////////////////////////
        // Loops
        // this way is used when you want access to index
        for (int i = 0; i < 11; i += 1 /* same as i++, we can make it i+=4*/) {
            System.out.println(i + ": hello");
        }
        // enhanced for loop : it loops from the start to finish without giving you access to the index
        String[] naaames = {
                "mazen",
                "ali",
                "fatma",
                "hussien",
                "alaa",
        };
        System.out.println("///enhanced for loop///");
        for (String name : naaames) {
            System.out.println(name);
        }
        // do while loop : done when you want to loop at least once
        System.out.println("/////////////////////////////////////////////////////// conditions and switches");
        ////////////////////////////////////////////////////////////////
        // conditions
        String gender = "FEMALE";
        if (gender.equals("FEMALE") || gender.equals("MALE")) {
            System.out.println("Valid Gender");
        } else {
            System.out.println("Invalid Gender");
        }
        String gender2 = "maLe";
        // equalsIgnoreCase : is for ignoring the diffrences in the capital or small letters
        if (gender2.equalsIgnoreCase("FEMALE") || gender2.equalsIgnoreCase("MALE")) {
            System.out.println("Valid Gender");
        } else {
            System.out.println("Invalid Gender");
        }
        // switch cases
        char grade = 'A';
        // the data types that are passed to switch : byte short int char string enums Byte Short Integer Character, but not null
        switch (grade) {
            case 'A':
                System.out.println("this grade is Exellent");
                break;
            case 'B':
            case 'C':
                System.out.println("this grade is good");
                break;
            default:
                System.out.println("this grade is fail");
        }
        System.out.println("/////////////////////////////////////////////////////// methods");
        ////////////////////////////////////////////////////////////////
        // methods
        /*
        how we build methods:

            - Access modifiers
            - optional static keyword
            - return type
            - name
            - optional parameters
            - method body
            - optional return value
         */
        // i made a methode before main methode called add, i used it here
        int r = add(20, 20);
        System.out.println(r);

        // rental yield task
        double rentalExample = rentalYieldClaculator(1300, 250_000);
        System.out.println(rentalExample + " %");
        System.out.println();

//        // Type Inference ==> are introduced in java 10
//        // var keyword only used for local variables
//        var name = "jamila";
//        // this is the type for arrays //
//        var addresses = new String[]{"koko","jojo","lolo"};
//        var number = 265516;
//        var ishome = false;
//        var balance = 563261.626;
//        System.out.println(balance);

        String[] icons = {"hamza", "bakr", "omar"};
        for (String icon : icons) {
            if (icon.startsWith("h")) {
                continue;
                // continue ends the whole iteration and moves to the next one
            }
            System.out.println(icon);
        }
        System.out.println();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Enums
        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);
        System.out.println(Arrays.toString(Gender.values()));
        for (Gender geeender : Gender.values()) {
            System.out.print(geeender + " ");
        }
        System.out.println();
        System.out.println();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        // type casting: convert one data type to another
        // implicit type ==> widiening, convert from small data type to a larger data type, dont lose data
        int balance = 100;
        double balance2 = balance;
        // explicit type ==> narrowing, convert from large data type to a smaller data type,
        double remaningBalance = 100.2626;
        int remaningBInt = (int) remaningBalance;

        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Wrapper classes:
        // int => Integer
        // double => Double
        // char => Character
        // float => Float ........... etc
        int age = 20;
        // age. ==> dont have functions to preform on
        Integer agg = 20;
        System.out.println(agg.toString());
        String james = "58";
        System.out.println(Double.parseDouble(james));
        System.out.println();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        // STRINGS :
        // this string is stored in the string pool in the heap
        String nome1 = "kojolp";
        // this string is stored in the heap as an object
        String nome2 = new String("kojolp");
        System.out.println("comparing equality with == : " + nome1 == nome2);
        // here we are comparing the contents with .equals()
        System.out.println("comparing equality with .equals() : " + nome1.equals(nome2));
        // this transform integers to strings
        String str1 = String.valueOf(22);
        System.out.println(str1);
        System.out.println(String.format("Number %s", str1));
        String[] bun = {"aisha", "salah", "cozmos"};
        System.out.println(String.join(" | ", bun));

        // String s = "Hello";
        // s = s + "World";
        // this will create two objects, as String class is immutable

        // StringBuilder sb = new StringBuilder("Hello");
        // sb.append("World");
        // this will create one object as StringBuilder is mutable
        // StringBuilder is used for appending many strings in one
        //====> look for further explanation for StringBuilder

        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Dates ==> in the dates class

    }
}

