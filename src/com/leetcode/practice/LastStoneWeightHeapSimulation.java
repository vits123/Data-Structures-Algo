/*
 * We can use Heap/Priority queue to remove maximum stones because heap can efficiently do that 
 * Time Complexity - O(N logN)
 * Space Complexity - O(N)
 */


package com.leetcode.practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeightHeapSimulation {
  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

    for (int stone : stones) {
      heap.add(stone);
    }

    while (heap.size() > 1) {
      int stone1 = heap.remove();
      int stone2 = heap.remove();
      if (stone1 != stone2) {
        heap.add(stone1 - stone2);
      }
    }

    return heap.isEmpty() ? 0 : heap.remove();

  }
  
  
  public static void main(String[] args) {
    LastStoneWeightHeapSimulation hs = new LastStoneWeightHeapSimulation();
    int ans = hs.lastStoneWeight(new int[] {2,7,4,1,8,1});
    System.out.println("Output = "+ans);
  }
  
  
}
