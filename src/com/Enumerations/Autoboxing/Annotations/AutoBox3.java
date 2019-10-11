package com.Enumerations.Autoboxing.Annotations;

public class AutoBox3 {

  public static void main(String[] args) {
    Integer iob, iob2;
    int i;

    iob = 100;
    System.out.println("Original value of iob: " + iob);
    ++iob;   // first auto-unbox happens and then again rebox to iob
    System.out.println("After ++iob: " + iob);
    iob2 = iob + (iob / 3);
    System.out.println("iob2 after expression: " + iob2);

    i = iob + (iob / 3);   // auto-unbox happens first for calculation assigns it to i
    System.out.println("i after expression: " + i);

  }

}
