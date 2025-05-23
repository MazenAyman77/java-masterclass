package com.amigoscode;

import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {

        File filex = createFile("src/fooso.csv");
        writeFile(filex, true);

        // Read from file
        try {
            Scanner scanner = new Scanner(filex);

            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void writeFile(File file, boolean append) {
//        try {
//            // method to write in a file
//            FileWriter fileWriter = new FileWriter(file, append);
//            PrintWriter writer = new PrintWriter(fileWriter);
//            writer.println("hello");
//            writer.println("hello");
//            writer.println("worldy");
//            // flush : flush these words into the file, then we close with writer.close()
//            writer.flush();
//            writer.close();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        // same method using try with resources, here you dont have to code .flush and .close
        // as the classes filewriter and printwriter implements from closable and flushable
        try (FileWriter fileWriter2 = new FileWriter(file, append);
             PrintWriter printwriter = new PrintWriter(fileWriter2);
        ) {
            printwriter.println("Saso");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static File createFile(String path) {
        try {
            File file1 = new File(path);
            if (!file1.exists()) {
                file1.createNewFile();
            }
            return file1;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}
