// Enumerations are class types

package com.Enumerations.Autoboxing.Annotations;


enum Apple_Fruit_Types {
  Jonathan(10), Goldendel(9), Reddel(12), Winesap(15), Cortland(8);
  private int price;

  Apple_Fruit_Types(int p) {
    price = p;
  }

  int getPrice() {
    return price;
  }

}


public class EnumDemo3 {

  public static void main(String[] args) {
    Apple_Fruit_Types p;
    System.out.println("Winesap costs " + Apple_Fruit_Types.Winesap.getPrice() + " cents.");
    System.out.println();
    System.out.println("All apple prices");
    for (Apple_Fruit_Types a : Apple_Fruit_Types.values()) {
      System.out.println(a + " costs " + a.getPrice() + " cents.");
    }


  }
}
