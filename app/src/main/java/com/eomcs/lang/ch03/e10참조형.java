package com.eomcs.lang.ch03;

public class e10참조형 {
  public static void main (String[] args) {

    String s1 = "abc";
    String s2 = "abc";
    String s3 = new String("abc");

    System.out.println(s1);
    System.out.println(s2);

    System.out.println(s1 == s2); //true 주소를 비교
    System.out.println(s1 == s3); //false 

    System.out.println(s1.equals(s3)); // true : 참조형에서 기본형처럼 값을 비교하는 방법

  }

}
