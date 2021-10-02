package com.acme.domain.quiz;

import java.util.stream.Stream;

public class TestClass {

    public static void main(String[] args) {
        System.out.println(Stream.of("g","y","b").max((s1,s2) -> s1.compareTo(s2)).filter(s->s.endsWith("n")).orElse("y"));}

       // float fl = 4.5f / 2;
         //fl = (fl / 2f);
}
