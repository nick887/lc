package com.nick.lc_268丢失的数字;

/**
 * @author nick
 * @version 1.0, 2021/11/6
 * @since 1.0.0
 */
class Solution {
    public int missingNumber(int[] nums) {
        int i = nums[0];
        for (int j = 1; j < nums.length; j++) {
            i = i ^ nums[j];
        }
        for (int j = 0; j < nums.length + 1; j++) {
            i = i ^ j;
        }
        return i;
    }
}