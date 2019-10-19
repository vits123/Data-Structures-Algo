package com.CollectionsAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String>();
    al.add("C");
    al.add("A");
    al.add("E");
    al.add("B");
    al.add("D");
    al.add("F");

    System.out.println("Original contents of arraylist");

    Iterator<String> i1 = al.iterator();

    while (i1.hasNext()) {
      String element = i1.next();
      System.out.print(element + " ");
    }
    System.out.println();
    ListIterator<String> litr = al.listIterator();
    while (litr.hasNext()) {
      String element = litr.next();
      litr.set(element + "+");
    }

    System.out.println("Modified contents of al:\n ");
    i1 = al.iterator();
    while (i1.hasNext()) {
      String element = i1.next();
      System.out.print(element + " ");
    }
    System.out.println();

    System.out.println("Modified list backwards:\n");

    while (litr.hasPrevious()) {
      String element = litr.previous();
      System.out.print(element + " ");
    }

  }

}
