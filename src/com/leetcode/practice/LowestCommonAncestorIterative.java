/*
   Leetcode 236: Lowest Common Ancestor
   Time complexity - O(n)
   Space complexity - O(n)
    Iterative LCA using parent pointers using Deque interface
    Algorithm:
    1. Start from the root node and traverse the tree
    2. Until we find p & q both, keep storing the parent pointers in a dictionary
    3. Once we have found both p & q, we get all the ancestors for p using the parent dictionary and add to a set called ancestors
    4. Also, we traverse through ancestors for node q. If the ancestor is present in the ancestors set for p
    5. It's a 1st ancestor common between p & q, we found LCA
 */


package com.leetcode.practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}


public class LowestCommonAncestorIterative {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    // stack for tree traversal
    Deque<TreeNode> stack = new ArrayDeque<>();

    // hashmap for parent pointers
    Map<TreeNode, TreeNode> parent = new HashMap<>();

    parent.put(root, null);
    stack.push(root);

    // iterate until we find both the nodes p and q
    while (!parent.containsKey(p) || !parent.containsKey(q)) {
      TreeNode node = stack.pop();

      if (node.left != null) {
        parent.put(node.left, node);
        stack.push(node.left);
      }

      if (node.right != null) {
        parent.put(node.right, node);
        stack.push(node.right);
      }
    }

    Set<TreeNode> ancestors = new HashSet<>();
    while (p != null) {
      ancestors.add(p);
      p = parent.get(p);
    }

    while (!ancestors.contains(q)) {
      q = parent.get(q);
    }

    return q;

  }

  public static void main(String[] args) {
    TreeNode t = new TreeNode(1);

  }
}
