package com.nick.lc_102二叉树层序遍历;

import java.nio.file.LinkOption;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list;
        List<List<Integer>> res = new LinkedList<>();
        int size = 1;
        int count = 0;
        if (root == null) {
            return res;
        }
        list = new LinkedList<>();
        while (!queue.isEmpty()) {
            for (int i = 0; i < size; i++) {
                TreeNode a = queue.poll();
                list.add(a.val);
                if (a.left != null) {
                    queue.add(a.left);
                    count++;
                }
                if (a.right != null) {
                    queue.add(a.right);
                    count++;
                }
            }
            size = count;
            count = 0;
            res.add(list);
            list = new LinkedList<>();
        }
        return res;
    }
}