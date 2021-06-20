package com.eomcs.lang.ch03;

import java.util.Scanner;

public class e06스캐너 { //사용자로부터 값을 입력받아 출력하는 것 : scanner

  public static void main(String[] args) {

    //    String s = "abc";
    //    String s = new String("abc");
    //    System.out.println(s);

    Scanner scn = new Scanner(System.in); // 키보드로부터 입력받을 객체생성

    //    System.out.print("정수 입력 : ");
    //    int i = scn.nextInt();
    //    for (int j = 1; j <= i; j++); {
    //      System.out.println(j);
    //  }

    System.out.println("문자열 입력 : ");
    String s = scn.nextLine(); //키보드로부터 문자열을 입력받음 (엔터전까지)
    System.out.println(s);
  }
}

