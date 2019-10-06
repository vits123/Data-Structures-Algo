
/*
    values() & valueOf() demo: Enumerations
 */

package com.Enumerations.Autoboxing.Annotations;

enum Apple2 {
  Jonathan, Goldendel, RedDel, Winesap, Cortland
}

public class Enumdemo2 {

  public static void main(String[] args) {
    Apple2 apple2;

    Apple2 app[] = Apple2.values();

    for (Apple2 ap : app) {
      System.out.println(ap);
    }

    System.out.println();

    apple2 = Apple2.valueOf("Winesap");
    System.out.println("apple2 contains " + apple2);

  }
}
