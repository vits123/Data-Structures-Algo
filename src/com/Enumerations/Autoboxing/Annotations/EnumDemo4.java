package com.Enumerations.Autoboxing.Annotations;


enum Apple_4 {
  Jonathan, Goldendel, RedDel, WineSap, Cortland
}

public class EnumDemo4 {

  public static void main(String[] args) {
    Apple_4 ap, ap2, ap3;

    System.out.println("Apple constants and their ordinal values");

    for (Apple_4 a : Apple_4.values()) {
      System.out.println(a + " " + a.ordinal());
    }

    ap = Apple_4.RedDel;
    ap2 = Apple_4.Goldendel;
    ap3 = Apple_4.RedDel;

    System.out.println();

    if (ap.compareTo(ap2) < 0) {
      System.out.println(ap + " comes before " + ap2);
    }

    if (ap.compareTo(ap2) > 0) {
      System.out.println(ap2 + " comes before " + ap);
    }

    if (ap.compareTo(ap3) == 0) {
      System.out.println(ap + " equals " + ap3);
    }

    System.out.println();

    if (ap.equals(ap2)) {
      System.out.println("Error!");
    }

    if (ap == ap3) {
      System.out.println(ap + " == " + ap3);
    }


  }
}
