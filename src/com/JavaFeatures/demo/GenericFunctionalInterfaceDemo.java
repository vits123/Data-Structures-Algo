
// Use of Generic functional interfaces with lambda expressions

package com.JavaFeatures.demo;

public class GenericFunctionalInterfaceDemo {

  public static void main(String[] args) {
    SomeFunc<String> reverse = (s) -> {
      String result = "";
      int i;
      for (i = s.length() - 1; i >= 0; i--) {
        result += s.charAt(i);
      }
      return result;

    };

    System.out.println("Reverse of Lambda is " + reverse.func("Lambda"));
    System.out.println("Reverse of abc is " + reverse.func("abc"));


    SomeFunc<Integer> factorial = (n) -> {
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
 * Reverse of Lambda is adbmaL 
 * Reverse of abc is cba 
 * factorial of 3 is 6 
 * factorial of 5 is 120
 * 
 */
