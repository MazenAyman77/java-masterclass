package com.amigoscode.streams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class WorkingWithStreams {

    public static void main(String[] args) {

    }

    @Test
    void name(){

        List<String> names = new ArrayList<>();
        names.add("mazen");
        names.add("ayman");
        names.add("zina");
        Stream<String> stream = names.stream();

        // better way than the above
        Stream<String> nameStream = Stream.of("ayman", "malek", "zina");


    }

}
