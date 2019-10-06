
/* Run-Time Type Comparisons within a generic hierarchy   */

package com.JavaFeatures.demo;

public class Gen1<T> {

  T ob;

  Gen1(T o) {
    ob = o;
  }

  T getob() {
    return ob;
  }
}

class Gen2<T> extends Gen1<T> {

  Gen2(T o) {
    super(o);
  }
}


class HierDemo3 {

  public static void main(String args[]) {
    Gen1<Integer> iob = new Gen1<Integer>(88);
    Gen2<Integer> iob2 = new Gen2<Integer>(99);

    Gen2<String> strob2 = new Gen2<String>("Generics Test");

    if (iob2 instanceof Gen2<?>) {
      System.out.println("iob2 is instance of Gen2");
    }

    if (iob2 instanceof Gen1<?>) {
      System.out.println("iob2 is instance of Gen1");
    }

    System.out.println();

    if (strob2 instanceof Gen2<?>) {
      System.out.println("strob2 is instance of Gen2");
    }

    if (strob2 instanceof Gen1<?>) {
      System.out.println("strob2 is instance of Gen1");
    }

    System.out.println();

    if (iob instanceof Gen2<?>) {
      System.out.println("iob is instance of Gen2");
    }

    if (iob instanceof Gen1<?>) {
      System.out.println("iob is instance of Gen1");
    }

    // Generic type info does not exist at run time
    //if(iob2 instanceof Gen2<Integer>)
    //System.out.println("iob2 is instance of Gen2<Integer>" );

  }

}

/*
  			iob2 is instance of Gen2
			iob2 is instance of Gen1
			strob2 is instance of Gen2
			strob2 is instance of Gen1
			iob is instance of Gen1
*/




