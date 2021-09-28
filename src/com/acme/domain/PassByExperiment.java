package com.acme.domain;

import com.acme.utils.MyDate;

public class PassByExperiment {


    public static void passObject(MyDate d) {
        d.setYear(2009);
    }
    public static void passPrimitive(int i)
    {
        i=100;
    }
    public static void passByString(String s) {
//       dd/mm/ccyy
        int yearSlash = s.lastIndexOf('/');
         s = s.substring(0,yearSlash+1);
         s += "2012";
         System.out.println("new date string: "  + s);
    }

    public static void passByStringBuilder(StringBuilder sb) {
//       dd/mm/ccyy
        int yearSlash = sb.lastIndexOf("/");
        String newS = sb.substring(0,
                yearSlash+1);
        sb.append("2012");
        System.out.println("new date string: "  + sb);
    }

    public static void main(String[] args) {

        MyDate date = new MyDate(20,1,2008);

        System.out.println("before passing an object " + date);
        passObject(date);

        System.out.println("After passing an Object " + date);

        System.out.println("B4 Passing primitive" + date.getYear());
        passPrimitive(date.getYear());
        System.out.println("after Passing primitive" + date.getYear());

        String x = date.toString();
        System.out.println("Before passing a String " + x);
        passByString(x);
        System.out.println("After passing a String " + x);

        StringBuilder xB = new StringBuilder(date.toString());
        System.out.println("Before passing a String builder " + xB);
        passByStringBuilder(xB);
        System.out.println("After passing a String Builder" + xB);

    }

}
