package com.amigoscode;

import java.math.BigDecimal;
import java.time.*;

public class Dates {
    public static void main(String[] args) {
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//        System.out.println(now.getMonth());
//        System.out.println(now.getDayOfMonth());
//        System.out.println(now.getHour());
//        System.out.println(now.getMinute());
//        System.out.println(now.getYear());
//        System.out.println(now.minusDays(5));
//        System.out.println("///////////////////////////////////////////////////////////////////////////");
//        // if you only want to work with dates but not time, use LocalDate class not LocalDateTime class
//        LocalDate now2 = LocalDate.now();
//        System.out.println(now2);
//        System.out.println(now2.getMonth());
//        System.out.println(now2.getDayOfMonth());
//        System.out.println(now2.getYear());
//        System.out.println(now2.minusDays(5));
//        System.out.println("///////////////////////////////////////////////////////////////////////////");
        // if you only want to work with time but not dates, use LocalTime class not LocalDateTime class

        // create your own date
        LocalDateTime someDate = LocalDateTime.of(2000, Month.DECEMBER, 7, 20, 30);
        System.out.println("Some Date : " + someDate);

        // to get different zones
//        for (String zones : ZoneId.getAvailableZoneIds()){
//            System.out.println(zones);
//        }
        System.out.println("Time Now : " + LocalDateTime.now());
        System.out.println("Time In Baghdad : " + LocalDateTime.now(ZoneId.of("Asia/Baghdad")));
        System.out.println("Zoned Date Time : " + ZonedDateTime.now());
        System.out.println("Instant Date Time : " + Instant.now());
        System.out.println();

        // when dealing with money use BigDecimal data type instead of floats or doubles
        double nn1 = 0.03;
        double nn2 = 0.02;
        System.out.println(nn1 - nn2);
        BigDecimal no1 = new BigDecimal("0.03");
        BigDecimal no2 = new BigDecimal("0.02");
        System.out.println(no1.subtract(no2));
        BigDecimal numb1 = BigDecimal.TEN;
        System.out.println(numb1.max(BigDecimal.ONE));
        System.out.println(numb1.add(BigDecimal.TEN));
        System.out.println(numb1.compareTo(new BigDecimal("15")));
        System.out.println(numb1.compareTo(new BigDecimal("9")));
        System.out.println(numb1.compareTo(BigDecimal.TEN));


    }
}
