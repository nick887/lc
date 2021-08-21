package com.nick.lc_98验证二叉搜索树;

/**
 * @author nick
 * @version 1.0, 2021/8/22
 * @since 1.0.0
 */

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return foo(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean foo(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }

        if (node.val > upper) {
            return false;
        }
        if (node.val < lower) {
            return false;
        }
        return foo(node.left, lower, node.val) && foo(node.right, node.val, upper);
    }

    public static void main(String[] args) {
    }
}
