package com.nick.lc_101对称二叉树;

/**
 * @author nick
 * @version 1.0, 2021/8/22
 * @since 1.0.0
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


class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }

    public static boolean check(TreeNode l,TreeNode r) {
        if (l == null && r ==null) {
            return true;
        }else if (l == null || r == null) {
            return false;
        }
        if (l.val != r.val) {
            return false;
        }
        return check(l.left,r.right) && check(l.right,r.left);
    }
}
