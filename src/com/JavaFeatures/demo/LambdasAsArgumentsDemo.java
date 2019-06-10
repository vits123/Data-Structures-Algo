package com.JavaFeatures.demo;

public class LambdasAsArgumentsDemo {

  static String stringOp(StringFuncArg sf, String s) {
    return sf.func(s);
  }


  public static void main(String[] args) {
    String inStr = "lambdas add power to java";
    String outStr;

    System.out.println("Input String: " + inStr);

    outStr = stringOp((str) -> str.toUpperCase(), inStr);
    System.out.println("string in uppercase " + outStr);

    outStr = stringOp((str) -> {
      String result = "";
      int i;
      for (i = 0; i < str.length(); i++) {
        if (str.charAt(i) != ' ')
          result += str.charAt(i);
      }

      return result;
    }, inStr);

    System.out.println("String with spaces removed " + outStr);


    StringFuncArg reverse = (str) -> {
      String result = "";
      int i;
      for (i = str.length() - 1; i >= 0; i--) {
        result += str.charAt(i);

      }
      return result;
    };


    System.out.println("Reverse of string is " + stringOp(reverse, inStr));

  }

}

/*
 * input String lambdas add power to java 
 * string in uppercase LAMBDAS ADD POWER TO JAVA 
 * String with spaces removed lambdasaddpowertojava 
 * Reverse of string is avaj ot rewop dda sadbmal
 * 
 */


