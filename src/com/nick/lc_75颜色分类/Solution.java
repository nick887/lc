package com.nick.lc_75颜色分类;

import java.util.Arrays;

/**
 * @author nick
 * @version 1.0, 2021/8/18
 * @since 1.0.0
 */
class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        if (nums[l] == 2 && nums[r] == 0) {
            swap(nums, l++, r--);
        } else  {

        }
    }

    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 0, 2, 1, 1, 0};
        new Solution().sortColors(a);
        System.out.println(Arrays.toString(a));
    }
}
