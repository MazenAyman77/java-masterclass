package com.amigoscode.oop.abstractclasses;

import java.util.regex.Pattern;

public class NumberExtractor extends Extractor {

    public static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Number Extractor Report";
    }
}
