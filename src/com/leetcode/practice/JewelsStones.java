/*
    Leetcode 771: Jewels and Stones
    Time complexity - O(J.length + S.length)
    Space complexity - O(J.length)

    There is a 1 line solution to this problem using regex in Java
    return S.replaceAll("[^" + J + "]", "").length();
 */


package com.leetcode.practice;

import java.util.HashSet;

public class JewelsStones {

  public int numJewelsInStones(String J, String S) {
    HashSet<Character> jewels = new HashSet<>();
    for (char c : J.toCharArray()) {
      jewels.add(c);
    }

    int countOfJewelsInS = 0;
    for (char c : S.toCharArray()) {
      if (jewels.contains(c)) {
        countOfJewelsInS++;
      }
    }
    return countOfJewelsInS;

  }

  public static void main(String[] args) {
    JewelsStones Js = new JewelsStones();
    int result = Js.numJewelsInStones(new String("aA"), new String("aAbAbbbb"));
    System.out.println(result);
  }
}
