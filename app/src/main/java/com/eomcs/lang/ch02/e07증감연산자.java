package com.eomcs.lang.ch02;

public class e07증감연산자 {
  public static void main (String[] args) {

    int i = 10;
    int j = 20;

    //i를 1증가
    //    i = i +1;
    //    i += 1;
    ++i; //전위연산(먼저변신)
    i++; //후위연산(나중변신)
    System.out.println(i++);
    System.out.println(i);

    //j를 1감소
    //    j = j - 1;
    //    j -= 1;
    --j;
    j--;
    System.out.println(j--);
    System.out.println(j);

    int a = 10, b = 20;
    System.out.println(++a + b--);
    System.out.println(b);

    a = a + 1;
    System.out.println(a + b);
    //    b = b - 1;
  }

}
