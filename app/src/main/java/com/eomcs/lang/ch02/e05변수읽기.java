package com.eomcs.lang.ch02;

public class e05변수읽기 {
  public static void main (String[] args) {

    byte b = 10;
    int i = b; //큰 값<-작은 값 OK : 자동형변환
    System.out.println(i);

    b = (byte)i; //작은 값<-(작은타입)큰 값 : 강제형변환이 필요
    System.out.println(b);

    b = 10;
    //    b = b + 1; //(X)우변연산결과가 int
    b = (byte)(b + 1); //괄호주의
    System.out.println(b);

    int i1 = 44032;
    char c = (char)i1; //가
    System.out.println(c);

    int i2 = 10;
    int i3 = 3;
    int i4 = i2/i3; //몫
    System.out.println(i4); //3
    int i5 = i2%i3; //나머지
    System.out.println(i5); //1

    double d1 = i2/i3; //정확한 나누기가 아님
    System.out.println(d1);
    double d2 = (double)i2 / (double)i3;
    System.out.println(d2);
    double d3 = i2 / (double)i3;
    System.out.println(d3);
    double d4 = 10 / 3.;
    System.out.println(d4);
  }

}
