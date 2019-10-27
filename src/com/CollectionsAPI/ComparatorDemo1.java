/*
   Not covers JDK 8 reversed() method or lambda expressions
   Simple Comparator demo example
 */

package com.CollectionsAPI;

import java.util.Comparator;
import java.util.TreeSet;

class MyApp implements Comparator<String> {

  @Override
  public int compare(String aStr, String bStr) {
    return bStr.compareTo(aStr);
  }
  // No need to override equals or the default methods
}

public class ComparatorDemo1 {

  public static void main(String[] args) {
    TreeSet<String> ts = new TreeSet<>(new MyApp());
    ts.add("C");
    ts.add("A");
    ts.add("B");
    ts.add("E");
    ts.add("F");
    ts.add("D");

    for (String el : ts) {
      System.out.println(el + " ");
    }
    System.out.println();
  }

}
