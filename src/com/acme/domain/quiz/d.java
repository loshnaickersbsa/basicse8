package com.acme.domain.quiz;


class Shape {}
class Q  extends Shape{}
class T extends Shape{}

public class d {

    public static void main(String[] args) {
        Shape s = new  Q();
        Q q = new Q();

       // T tri =  (T)s;
        s=q;
        //T tri = (T)s;
        T tri = (T)s;

    }
}
