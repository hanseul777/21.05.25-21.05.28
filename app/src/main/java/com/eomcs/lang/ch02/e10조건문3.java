package com.eomcs.lang.ch02;

public class e10조건문3 {

  public static void main(String[] args) {

    int i = 40;

    if (i >= 90) {
      if (i >= 95) { //중첩if
        System.out.println("A++");
      }else {
        System.out.println("A");
      }

    } else if (i >= 80) {
      System.out.println("B");
    } else if (i >= 70) {
      System.out.println("C");
    } else if (i >= 60) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
  }

}
