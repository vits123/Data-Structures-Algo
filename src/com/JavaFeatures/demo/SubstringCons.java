// String constructor

package com.JavaFeatures.demo;

public class SubstringCons {

  public static void main(String[] args) {
    byte ascii[] = {65, 66, 67, 68, 69, 70};

    String s1 = new String(ascii);
    String s2 = new String(ascii, 2, 3);
    System.out.println(s1);
    System.out.println(s2);
  }

}
