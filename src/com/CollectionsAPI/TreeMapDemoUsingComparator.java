package com.CollectionsAPI;

import com.sun.source.tree.Tree;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TComp implements Comparator<String> {

  @Override
  public int compare(String aStr, String bStr) {
    int i, j, k;
    i = aStr.lastIndexOf(" ");
    j = bStr.lastIndexOf(" ");

    k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));

    if (k == 0) {
      return aStr.compareToIgnoreCase(bStr);
    } else {
      return k;
    }
  }
}

public class TreeMapDemoUsingComparator {

  public static void main(String[] args) {
    TreeMap<String, Double> tmcmp = new TreeMap<String, Double>(new TComp());
    tmcmp.put("John Dodge", new Double(3434.34));
    tmcmp.put("Tom Savoca", new Double(123.22));
    tmcmp.put("Jane Baker", new Double(1378.00));
    tmcmp.put("Tod Hall", new Double(99.22));
    tmcmp.put("Ralph Smith", new Double(-19.08));

    Set<Map.Entry<String, Double>> set = tmcmp.entrySet();
    for (Map.Entry<String, Double> a : set) {
      System.out.print(a.getKey() + " : ");
      System.out.println(a.getValue());
    }
    System.out.println();

    double balance = tmcmp.get("John Dodge");
    tmcmp.put("John Dodge", balance + 1000);

    System.out.println("John Dodge's new balance " + tmcmp.get("John Dodge"));

  }

}
