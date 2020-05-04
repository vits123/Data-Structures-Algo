package com.leetcode.practice;

public class RansomNoteEfficient {

  public boolean canConstruct(String ransomNote, String magazine) {
    int[] ar = new int[26];
    int m = magazine.length(); // magazine length
    int n = ransomNote.length(); // ransom note length

    for (int i = 0; i < m; i++) {
      ar[magazine.charAt(i) - 'a']++;
    }

    for (int i = 0; i < n; i++) {
      if (--ar[ransomNote.charAt(i) - 'a'] < 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    RansomNoteEfficient re = new RansomNoteEfficient();
    boolean t_or_f = re.canConstruct(new String("abbb"), new String("aabbb"));
    System.out.println(t_or_f);
  }
}
