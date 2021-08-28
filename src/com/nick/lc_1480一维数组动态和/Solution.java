package com.nick.lc_1480一维数组动态和;

/**
 * @author nick
 * @version 1.0, 2021/8/28
 * @since 1.0.0
 */
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}