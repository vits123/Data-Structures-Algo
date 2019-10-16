package com.CollectionsAPI;

import java.util.LinkedList;

public class LinkedListDemo {

  public static void main(String[] args) {
    LinkedList<String> l1 = new LinkedList<String>();
    l1.add("F");
    l1.add("B");
    l1.add("D");
    l1.add("E");
    l1.add("C");
    l1.addLast("Z");
    l1.addFirst("A");

    System.out.println("l1 = " + l1);

    l1.remove("D");
    l1.remove(2);

    System.out.println("l1 after change " + l1);   //[A,F,E,C,Z]

  }

}
