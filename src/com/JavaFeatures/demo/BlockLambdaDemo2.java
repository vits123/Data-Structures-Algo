// Block lambda that reverses characters in a string

package com.JavaFeatures.demo;

public class BlockLambdaDemo2 {

  public static void main(String[] args) {
    StringFunc reverse = (s) -> {
      String result = "";
      int i;
      for (i = s.length() - 1; i >= 0; i--) {
        result += s.charAt(i);
      }
      return result;

    };
    System.out.println("Reverse of Lambda is " + reverse.func("Lambda"));
    System.out.println("Reverse of foo is " + reverse.func("foo"));

  }

}
/*
 * Reverse of Lambda is adbmaL 
 * Reverse of foo is oof
 */
