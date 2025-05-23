package com.amigoscode.oop.abstractclasses;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class Extractor {

    public abstract Pattern getPattern();

    public abstract String getReportName();

    private String parse(String path) throws IOException {
        StringBuilder out = new StringBuilder();
        File file = createFile(path);
        Scanner scanner = new Scanner(file);

        if (scanner.hasNext()){
            scanner.nextLine();
        }else {
            return "empty file";
        }

        while (scanner.hasNext()){
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);
            boolean matches = matcher.matches();

            if (matches){
                out.append(nextLine).append("\n");
            }
        }

        return (out.length() == 0) ? "Empty File" : out.toString();
    }

    private File createFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        return file;
    }

    public void prepareAndSendReport(String path) throws IOException {
        System.out.println("start report " + getReportName() + "......");
        String report = parse(path);
        System.out.println(report);
        System.out.println("sent report " + getReportName());
    }
}
