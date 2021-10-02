package com.acme.domain.quiz;

import java.util.LinkedHashSet;
import java.util.Set;

public class c2 {

    public static void main(String[] args) {
        //System.out.println(Stream.of("g","y","b").max((s1,s2) -> s1.compareTo(s2)).filter(s->s.endsWith("n")).orElse("y"));}
        // byte c1[] = {10,20,30,40,50};
        // byte c2[] = {10,20,30,40,50};

        Set<String> s = new LinkedHashSet<>();
        s.add("3");
        s.add("1");
        s.add("3");
        s.add("3");
        s.add("2");
        s.add("3");
        s.add("1");

        s.forEach( s2 -> System.out.println(s2 + "-"));
    }
}
