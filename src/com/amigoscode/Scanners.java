package com.amigoscode;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Scanners {
    public static void main(String[] args) {
        // taking an input
        System.out.println("Whats your name?");
        Scanner scanner = new Scanner(System.in);
        // next line stores the String that the user enters in the variable
        String input = scanner.nextLine();
        System.out.println("fuck you " + input);
        System.out.println("whats your age?");
        // to accept from the user an integer only
        int input2 = scanner.nextInt();
        System.out.println("you are old as fuck, Iam younger than " + input2);

        // reading from a file, you must put it in a try catch block
        try {
            File inputFile = new File("E:/koko.txt");
            Scanner scanner2 = new Scanner(inputFile);
            while (scanner2.hasNext()) {
                System.out.println(scanner2.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


    }
}
