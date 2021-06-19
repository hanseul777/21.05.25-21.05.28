package com.eomcs.lang.ch02;

public class e04변수읽기 {
  public static void main (String[] args) {

    boolean bl = true;
    System.out.println(!bl);

    byte b = 127;
    System.out.println(b);

    char c = 'A'; //65
    //    c = 66; //'B'
    //    c = 44032; //가
    //    c = 44033; //각
    System.out.println(c);

    short s = 32000;
    //    s = 400000; // X 오버플로우
    System.out.println(s);

    int i = 10; //10진수
    i = 012; //8진수
    i = 0xA; //16진수 : 0~9,A,B,C,D,E,F
    System.out.println(i);

    //    long l = 123;
    long l = 123456789012345L;// long 값에는 접미사L(소문자 무관)
    System.out.println(l);

    double d = 3.14;
    System.out.println(d);

    float f = 3.14F; //float 값에는 접미사F가 필수
    System.out.println(f);
  }

}
