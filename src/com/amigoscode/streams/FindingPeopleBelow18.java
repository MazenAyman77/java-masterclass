package com.amigoscode.streams;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindingPeopleBelow18 {

    @Test
    public void imperativeApproach() throws IOException {
        List<People> peopleList = Mockdata.getData();
        List<People> aged = new ArrayList<>();

//        for (People person : peopleList) {
//            if (person.getAge() <= 18){
//                aged.add(person);
//            }
//        }

        int counter = 0;
        for (People person : peopleList) {

            if (counter < 10) {

                if (person.getAge() <= 18) {
                    aged.add(person);
                    counter++;
                }
            }

        }
        System.out.println(aged);
    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        //we start with a concrete class which in our case is the People Class
        List<People> peopleList = Mockdata.getData();
        List<People> youngPeople = peopleList.stream().filter(p -> p.getAge() <=18 ).limit(10).collect(Collectors.toList());
        youngPeople.forEach(System.out::println);

    }

}
