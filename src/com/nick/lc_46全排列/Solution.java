package com.nick.lc_46全排列;

import java.util.*;

/**
 * @author nick
 * @version 1.0, 2021/8/16
 * @since 1.0.0
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<List<Integer>> res = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        dfs(0, used, deque, nums, res);
        return res;
    }

    public static void dfs(int depth, boolean[] used, Deque<Integer>  deque, int[] nums, List<List<Integer>> res) {
        if (depth == nums.length) {
            res.add(new ArrayList<>(deque));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            System.out.println("push "+nums[i]);
            deque.add(nums[i]);
            used[i] = true;
            dfs(depth + 1, used, new ArrayDeque<>(deque), nums, res);
            System.out.println("pop "+deque.pollLast());
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().permute(new  int[]{1,2,3}));
    }
}
