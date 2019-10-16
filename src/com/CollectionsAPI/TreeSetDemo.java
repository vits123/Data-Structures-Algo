package com.CollectionsAPI;

import java.util.TreeSet;

public class TreeSetDemo {

  public static void main(String[] args) {
    TreeSet<String> ts = new TreeSet<String>();
    ts.add("C");
    ts.add("A");
    ts.add("B");
    ts.add("E");
    ts.add("F");
    ts.add("D");
    System.out.println("Given treeset is " + ts);

    System.out.println(ts.contains("Z"));

    System.out.println(ts.first());
    System.out.println(ts.size());
    System.out.println(ts.isEmpty());
    System.out.println(ts.comparator());

    System.out.println(ts.subSet("C", "F"));

  }

}
