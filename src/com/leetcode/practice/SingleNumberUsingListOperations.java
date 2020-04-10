package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class SingleNumberUsingListOperations {

  public int singleNumberList(int[] nums) {
    List<Integer> no_dup_list = new ArrayList<>();
    
    for (int i : nums) {
      if (!no_dup_list.contains(i)) {
        no_dup_list.add(i);
      } else {
        no_dup_list.remove(new Integer(i));
      }
    }
    return no_dup_list.get(0);
  }

  public static void main(String[] args) {
    SingleNumberUsingListOperations slo = new SingleNumberUsingListOperations();
    int ans = slo.singleNumberList(new int[] {4, 1, 2, 1, 2});
    System.out.println(ans);
  }

}
