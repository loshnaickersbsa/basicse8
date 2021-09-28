/**
 * */

package com.acme.utils;

import com.sun.codemodel.internal.JForEach;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public  class tets {



    public static void main(String args[]) throws IOException {


        Consumer<Namer> printit = e -> System.out.println(e.getFirstName() + " " + e.getLastName());
        List<Namer> names = new ArrayList<>(Arrays.asList( new Namer("Harry" , " Smith") , new Namer("Joe" , " Smith"),
        new Namer("Jane" , " doe"),new Namer("Mary" , " Jabneh") ,  new Namer("Harry" , " Homeowner")
                )
        );

        Collections.sort(names, (Namer e1, Namer e2) -> e1.getFirstName().compareTo(e2.getFirstName() ) );
        names.removeIf(e-> e.getFirstName().equals("Mary"));
        for (Namer e: names
             ) {
            System.out.println(e.getFirstName() + " " + e.getLastName());

        }

        names.forEach(s -> System.out.println(s.getFirstName() + " " + s.getLastName()));
    }
}

class Namer{

    final private String firstName, lastName;

    Namer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}


