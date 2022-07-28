package com.ssafy.live3.inter.replace.client;

import com.ssafy.live3.inter.replace.Calculator;

class CalculatorStub implements Calculator {  //대충으로만 구현해 놓은거
    public int add(int a, int b) {
      System.out.printf("파라미터 확인: %d, %d%n", a, b);
      return 0;
    }
  }

