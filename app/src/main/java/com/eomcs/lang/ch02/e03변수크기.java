package com.eomcs.lang.ch02;

public class e03변수크기 {
  public static void main(String [] args) {

    byte b = 127; //-128 ~ +127
    System.out.println(b);

    b += 1; //컴파일에러는 아니지만 논리오류
    System.out.println(b);

    ++b;
    System.out.println(b);
  }

}
