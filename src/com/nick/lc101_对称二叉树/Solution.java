package com.nick.lc101_对称二叉树;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
        int i = 0;
        int offset = 0;
        int t =0;
        Stack<Integer> stack = new Stack<>();
        stack.push(root.val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            t = 0;
            for (int j = 0; j < Math.pow(2,i) + offset; j++) {
                TreeNode poll = queue.poll();
                System.out.println(poll.val);
                if (!stack.empty() && stack.peek() == poll.val) {
                    stack.pop();
                } else {
                    stack.push(poll.val);
                }
                if (poll.left != null) {
                    queue.add(poll.left);
                }else {
                    t--;
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }else {
                    t--;
                }
            }
            offset = 0;
            offset += t;
            i++;
            if (!stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
