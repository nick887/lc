package com.nick.lc_53最大子序和;

/**
 * @author nick
 * @version 1.0, 2021/8/17
 * @since 1.0.0
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int r = 0;
        int count = nums[0];
        int max = count;
        while (r < nums.length - 1) {
            if (count < 0){
                count = nums[++r];
            } else {
                count += nums[++r];
            }
            max = count > max ? count : max;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}