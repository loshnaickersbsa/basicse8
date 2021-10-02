package com.acme.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

public class PlayWithDates {

    static void ld(){
        System.out.println( TimeZone.getDefault().getID() );
        System.out.println( Arrays.stream(TimeZone.getAvailableIDs()).findFirst() );

        LocalDate test = LocalDate.now(ZoneId.of("Africa/Abidjan"));
        System.out.println("test " + test   );
        System.out.println(test.getDayOfYear());
        System.out.println(test.toEpochDay()); //0 starts from 1970-01-01
        List<TemporalUnit> x = new ArrayList<>();
        //x=;
        LocalDate test2 =test.plus(Period.of(2, 3,4));
        System.out.println(test2.isAfter(test));
        System.out.println(test2);


    }
    static void lt()
    {

        LocalTime test = LocalTime.now(ZoneId.of("Africa/Abidjan"));
        System.out.println("test " + test   );

        //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Months
        LocalTime test2 = test.plusNanos(33333);
        System.out.println(test2.isAfter(test));

        test2 = LocalTime.of(13,0,0);
        System.out.println(test2);

    }

    static void pt () {

        LocalDate test = LocalDate.now(ZoneId.of("Africa/Abidjan"));
        System.out.println(test);
        LocalDate nowSA = LocalDate.now(ZoneId.of("Africa/Abidjan"));
        nowSA=nowSA.plus(Period.of(3,3,3));
        System.out.println(nowSA);

        Period testPeriod = Period.between(test , nowSA);
        System.out.println(testPeriod);

    }

    public static void main(String[] args) {
        pt();
    }
}
