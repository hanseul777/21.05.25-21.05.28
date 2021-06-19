package com.eomcs.lang.ch02;

import java.util.Scanner;

public class e12 {

  public static void main(String[] args) {

    //    int m = 2;
    Scanner scn = new Scanner(System.in);
    System.out.print("원하는 월을 입력 : ");
    int m = scn.nextInt();

    System.out.print(m + "월은 ");
    switch (m) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.print("31");
        break;

      case 2:
        System.out.print("28");
        break;

      case 4:
      case 6:
      case 9:
      case 11:
        System.out.print("30");
        break;

      default: //switch에서 default는 기타등등
        System.out.println("1~12사이의 정수를 입력하시오.");
    }
    System.out.println("일 까지입니다.");
  }

}
