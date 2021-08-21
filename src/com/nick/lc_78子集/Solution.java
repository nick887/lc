package com.nick.lc_78子集;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author nick
 * @version 1.0, 2021/8/20
 * @since 1.0.0
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        res.add(new LinkedList<>());
        if (nums.length == 0) {
            return res;
        }
        dfs(res, new LinkedList<>(), nums, 0);
        return res;
    }

    public static void dfs(List<List<Integer>> res, List<Integer> path, int[] nums, int start) {
        if (start == nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            List<Integer> t =new LinkedList<>(path);
            t.add(nums[i]);
            res.add(t);
            dfs(res, new LinkedList<>(t), nums, i+1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> subsets = new Solution().subsets(new int[]{1, 2, 3, 4});
        System.out.println(subsets);
    }
}
