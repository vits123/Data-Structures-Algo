package com.CollectionsAPI;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

  public static void main(String[] args) {
    // Create a tree map
    TreeMap<String, Double> tm = new TreeMap<String, Double>();
    tm.put("John Doe", new Double(3434.35));
    tm.put("Tom Smith", new Double(123.22));
    tm.put("Jane Baker", new Double(1378.00));
    tm.put("Tod Hall", new Double(99.22));
    tm.put("Ralph Smith", new Double(-19.08));

    Set<Map.Entry<String, Double>> settm = tm.entrySet();
    for (Map.Entry<String, Double> tme : settm) {
      System.out.print(tme.getKey() + " : ");
      System.out.println(tme.getValue());
    }
    System.out.println();

    double bal = tm.get("John Doe");
    tm.put("John Doe", bal + 1000);

  }

}
