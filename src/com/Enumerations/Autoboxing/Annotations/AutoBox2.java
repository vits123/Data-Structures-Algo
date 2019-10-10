package com.Enumerations.Autoboxing.Annotations;

public class AutoBox2 {

  static int m(Integer v) {
    return v;    // auto-unbox to int
  }


  public static void main(String[] args) {
    Integer iob = m(100);   // auto-boxing to Integer object reference
    System.out.println(iob);
  }

}
