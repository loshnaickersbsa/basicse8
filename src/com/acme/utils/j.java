package com.acme.utils;

import sun.util.calendar.BaseCalendar;

import java.text.ChoiceFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Stream;

public class j {
    @Override
    public String toString() {
        return "j{}";
    }

    static public  void main(String...args){

        Date aDate  = null;
        Calendar aC = Calendar.getInstance();
        aDate = aC.getTime();
        System.out.println( );
      //  aC.setTimeInMillis(145000000000000L).format(aDate);

}
}

enum Element {
    HEL("He", "Gass"),
    MAG("Mg" , "Solid");

    private String chemicalSymbol;
    private String nature;


    Element(String newChemicalSymbol, String newNature) {
        chemicalSymbol = newChemicalSymbol;
        nature = newNature;
    }

    public String getChemicalSymbol() {
        return chemicalSymbol;
    }

    public String getNature() {
        return nature;
    }
}