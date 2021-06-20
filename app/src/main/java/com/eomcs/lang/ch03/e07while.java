package com.eomcs.lang.ch03;

public class e07while {

  public static void main(String[] args) {
    int i = 1; //for과의 차이점 : while은 선언 후 들어감.
    int sum = 0;

    //A스타일
    //    while (sum <= 10) {
    //      sum += i++;
    //    }

    //B스타일
    while (true) {
      sum += i++;
      if (sum > 10) {
        break; //인접순환탈출
      }
    }

    //C스타일
    //    boolean b = true;
    //    while (b) {
    //      sum += i++;
    //      if (sum > 10) {
    //        b = false;
    //      }
    //    }

    System.out.println(i);

  }

}
