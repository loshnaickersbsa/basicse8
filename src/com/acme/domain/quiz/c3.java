package com.acme.domain.quiz;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class c3 {

    private int d;

    public static void main(String[] args) {
        //System.out.println(Stream.of("g","y","b").max((s1,s2) -> s1.compareTo(s2)).filter(s->s.endsWith("n")).orElse("y"));}

        // byte c1[] = {10,20,30,40,50};
        //  byte c2[] = {10,20,30,40,50};

        Supplier<String> i = () -> "car"; //functional interface returning car
        Consumer<String> c = x-> System.out.println(x.toLowerCase());
        Consumer<String> d = x-> System.out.println(x.toUpperCase());
        c.andThen(d).accept(i.get());
        System.out.println();
    }
}
