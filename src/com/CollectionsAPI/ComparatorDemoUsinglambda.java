package com.CollectionsAPI;

import java.util.TreeSet;

public class ComparatorDemoUsinglambda {

  public static void main(String[] args) {
    TreeSet<String> ts = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));
    ts.add("C");
    ts.add("A");
    ts.add("B");
    ts.add("E");
    ts.add("F");
    ts.add("D");

    for (String te : ts) {
      System.out.println(te);
    }
  }

}
