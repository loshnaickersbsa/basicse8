package com.acme.domain.quiz;

public class c6 {

    public static void main(String[] args) {
  Runnable r = () -> System.out.println("hi");
  new Thread(r).start();
    }
}
