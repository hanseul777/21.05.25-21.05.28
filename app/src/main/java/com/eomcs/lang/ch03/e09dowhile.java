package com.eomcs.lang.ch03;

import java.util.Scanner;

public class e09dowhile {

  public static void main(String[] args) {

    //    System.out.println("q를 입력하면 종료 : ");
    //    Scanner scn = new Scanner(System.in);
    //    String str = scn.nextLine();

    //    System.out.println(str);

    //    while (str!="q") {
    //      while (!str.equals("q")) {
    //        System.out.println("q를 입력하면 종료 : ");
    //        str = scn.nextLine();
    //      }
    //    }

    String str; //선언을 밖으로 빼서 dowhile실행동안 계속 재선언
    Scanner scn = new Scanner(System.in);
    do {
      System.out.print("q를 입력하면 종료 : ");
      str = scn.nextLine();
    } while(!str.equals("q"));

    System.out.println("종료합니다.");
  }

}
