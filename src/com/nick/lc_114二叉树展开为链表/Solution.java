package com.nick.lc_114二叉树展开为链表;

/**
 * @author nick
 * @version 1.0, 2021/8/28
 * @since 1.0.0
 */



class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Solution {
    public void flatten(TreeNode root) {

    }

    public static void foo(TreeNode node){
        if (node == null){
            return;
        }
        foo(node.left);
        node.left.left = node.right;
        foo(node.right);
    }
}
