package com.CollectionsAPI;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

  public static void main(String[] args) {
    ArrayDeque<String> adq = new ArrayDeque<String>();
    adq.add("A");
    adq.add("B");
    adq.add("D");     // A,B,D,E,F
    adq.add("E");
    adq.add("F");

    System.out.println(adq.element());   // A

    System.out.println(adq.offer("Z"));  // A,B,D,E,F,Z //true

    System.out.println(adq.peekLast());   // Z

    System.out.println(adq.peekFirst());   // A

    System.out.println(adq.pollFirst());    // A

    System.out.println(adq.pollLast());   // Z

    System.out.println("Popping the stack");

    while (adq.peek() != null) {
      System.out.println(adq.pop());     //
    }

  }
}
