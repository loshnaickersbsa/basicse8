package com.acme.utils;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Objects;

public class MyDate {

    private byte day;
    private short year;
    private byte month;

    {
        this.day = 1;
        this.year = 2000;
        this.month =  1;
    }

    public MyDate() {
        this(1,1,1900);
    }

    public MyDate(int day, int month, int year) {
      //Default constructor always called 1st
        if (valid(day, month, year) ) { //if it's invalid dafault date used.
            this.day = (byte) day;
            this.year = (short) year;
            this.month = (byte) month;
        }
    }

    public void setDate(int day, int month, int year

    ) {
        this.day = (byte)day;
        this.year = (short)year;
        this.month = (byte)month;
    }

    public void setDay(int day) {
         if (valid(day, month, year) )
              this.day = (byte)day;
    }
    public void setYear(int year) {
        if (valid(day, month, year) )
            this.year = (short) year;
    }

    public void setMonth(int month) {

        if (valid(day, month, year) )
            this.month = (byte)month;
    }

    public static void leapYears() {
        for (int i = 1752; i <= 2020; i = i + 4) {
            if ((i % 100 != 0) || (i % 400 == 0))
                System.out.println("The year " + i + " is a leap year");
        }
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    private boolean valid(int day, int month, int year) {
        if (day > 31 || day < 1 || month > 12 || month < 1) {
            System.out.println("Attempting to create a non-valid date "
                    + month + "/" + day + "/" + year);
            return false;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return (day <= 30);
            case 2:
                return day <= 28 || (day == 29 && year % 4 == 0);
        }
        return true;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                 day +
                "/" + month +
                "/" + year +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof  MyDate) {
            MyDate dateIn = (MyDate) obj;

            if (
                    this.day == dateIn.day &&
                            this.month == dateIn.month &&
                            this.year == dateIn.year) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.day, this.month , this.year);
    }
}
