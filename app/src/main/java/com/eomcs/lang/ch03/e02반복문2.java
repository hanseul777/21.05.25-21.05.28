package com.eomcs.lang.ch03;

public class e02반복문2 {

  public static void main(String[] args) {

    long sum = 0;

    for (int i = 1; i <= 100000; i++) {
      sum += i;
    }

    System.out.println(sum);


  }

}
