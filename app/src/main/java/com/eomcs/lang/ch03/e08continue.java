package com.eomcs.lang.ch03;

public class e08continue {

  public static void main(String[] args) {

    int sum = 0;

    for (int i = 1; i <= 10; i++) {
      if (i % 3 == 0) { //3의 배수를 제외한 합을 구하는 법
        continue;
      }
      sum += i;
    }
    System.out.println(sum);
  }

}
