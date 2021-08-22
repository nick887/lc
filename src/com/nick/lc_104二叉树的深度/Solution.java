package com.nick.lc_104二叉树的深度;

/**
 * @author nick
 * @version 1.0, 2021/8/22
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
class Solution {
    public int maxDepth(TreeNode root) {
        return foo(root,0);
    }

    public static  int foo(TreeNode node , int depth) {
        if (node == null) {
            return depth;
        }
        return Math.max(foo(node.left,depth+1),foo(node.right,depth+1));
    }
}
