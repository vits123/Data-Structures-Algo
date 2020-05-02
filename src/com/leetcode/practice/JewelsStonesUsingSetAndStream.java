/*
    Jewels and Stones using Set & Stream in Java 8
 */


package com.leetcode.practice;

import java.util.Set;
import java.util.stream.Collectors;

public class JewelsStonesUsingSetAndStream {

  public int numJewelsAndStones(String J, String S) {
    Set<Integer> jewels = J.chars().boxed().collect(Collectors.toSet());
    return (int) S.chars().boxed().filter(jewels::contains).count();
  }

  public static void main(String[] args) {
    JewelsStonesUsingSetAndStream Jstream = new JewelsStonesUsingSetAndStream();
    int ans = Jstream.numJewelsAndStones("aA", "aAAcccc");
    System.out.println(ans);
  }
}
