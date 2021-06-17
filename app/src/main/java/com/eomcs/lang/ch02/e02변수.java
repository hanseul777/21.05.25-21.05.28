package com.eomcs.lang.ch02;

public class e02변수 {
  public static void main (String[] args) {
    int score = 100;//변수 선언과 초기화를 동시

    System.out.println("점수는 " + score + "점입니다" );

    int i;//변수 선언만
    i = 10;//초기화 따로(필수 없으면 에러)
    i = i + 1;//i를증가
    i += 1;//i를증가
    ++i;//i를증가(1씩)
    System.out.println(i);

    int j = 20;
    i = j + 1;
    j = j + 2;//j를2증가
    j += 2;//j를2증가
    System.out.println(i + j);


    int k = 1;
    k = k * 2;
    k *= 2;
    System.out.println(k);

    int a, b;
    a = b = 90;
    System.out.println(a + b);
    System.out.println(a != b);
  }

}
