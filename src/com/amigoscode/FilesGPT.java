package com.amigoscode;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FilesGPT {
    public static void main(String[] args) {
////        String fileName = "src/Users.csv";
////
////        try(FileWriter fileWriter = new FileWriter(fileName)) {
////
////            fileWriter.append("name,age\n");
////            fileWriter.append("ali,22\n");
////            fileWriter.append("hassan,23\n");
////
////            fileWriter.append("mohamed,25\n");
////
////            System.out.println("success");
////
////        }catch (IOException e){
////            e.getMessage();
////        }
//
//        File file = new File("src/Users.csv");
//        String[] array = new String[4];
//        int count = 0;
//        try{
//            Scanner scanner = new Scanner(file);
//
//            while (scanner.hasNext()){
//                array[count] = scanner.nextLine();
//                count ++;
////                System.out.println(scanner.nextLine());
//            }
//
//        }catch (FileNotFoundException e){
//            e.getMessage();
//        }
//
//        String[][] data = new String[4][2];
//        try(BufferedReader br = new BufferedReader(new FileReader("src/Users.csv"))){
//            String line;
//            int row = 0;
//
//            while ((line = br.readLine()) != null && row < 4){
//                data[row] = line.split(",");
//                row ++;
//            }
//        }
//        catch (IOException e){
//            e.getMessage();
//        }
//
//        for (int i = 0; i < data.length; i++){
//            if (data[i].length > 1 ){
//                System.out.println(data[i][1]);
//            }
//        }
//    }

        String word = "adnklAkldasKSJADN";
        System.out.println(word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase());
}
}
