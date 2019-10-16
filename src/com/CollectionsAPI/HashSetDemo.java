package com.CollectionsAPI;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

  public static void main(String[] args) {
    HashSet<String> h = new HashSet<String>();

    h.add("Vedant");
    h.add("Aishwarya");
    h.add("Aditya");
    h.add("Narendra");
    h.add("Sangita");
    h.add("Shailaja");
    h.add("Kailas");
    h.add("Supriya");

    System.out.println("Hashset is " + h);
    System.out.println("Size =" + h.size());

    System.out.println(h.clone());

    System.out.println(h.contains("Kailas"));
    System.out.println(h.isEmpty());

    Iterator<String> ihs = h.iterator();
    while (ihs.hasNext()) {
      System.out.println(ihs.next());
    }


  }


}
