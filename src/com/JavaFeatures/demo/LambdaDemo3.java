package com.JavaFeatures.demo;

public class LambdaDemo3 {

  public static void main(String[] args) {

    NumericTest2 isFactor = (n, d) -> (n % d) == 0;

    if (isFactor.test(10, 2))
      System.out.println("2 is factor of 10");

    if (!isFactor.test(2, 10))
      System.out.println("10 is not a factor of 2");


  }

}
/*
 * 2 is factor of 10 
 * 10 is not a factor of 2 
 */
