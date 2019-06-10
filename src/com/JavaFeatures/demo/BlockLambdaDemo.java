package com.JavaFeatures.demo;

public class BlockLambdaDemo {

  public static void main(String[] args) {
    NumericFunc factorial = (n) -> {
      int result = 1;
      for (int i = 1; i <= n; i++) {
        result = i * result;
      }
      return result;
    };

    System.out.println("factorial of 3 is " + factorial.func(3));
    System.out.println("factorail of 5 is " + factorial.func(5));

  }

}
/*
 *      factorial of 3 is 6
        factorail of 5 is 120 
 */
