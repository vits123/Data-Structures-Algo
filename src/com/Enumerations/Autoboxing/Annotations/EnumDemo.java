package com.Enumerations.Autoboxing.Annotations;

enum Apple {
  Jonathan, Goldendel, RedDel, Winesap, Cortland
}

public class EnumDemo {

  public static void main(String[] args) {
    Apple ap;

    ap = Apple.RedDel;

    System.out.println("Value of ap: " + ap);

    ap = Apple.Goldendel;

    if (ap == Apple.Goldendel) {
      System.out.println("ap contains Goldendel,\n");
    }

    switch (ap) {
      case Jonathan:
        System.out.println("Jonathan is red.");
        break;

      case Goldendel:
        System.out.println("Golden delecious is yellow");
        break;

      case RedDel:
        System.out.println("Red delecious is red.");
        break;

      case Winesap:
        System.out.println("Winesap is red.");
        break;

      case Cortland:
        System.out.println("Cortland is red");
        break;

    }


  }

}
