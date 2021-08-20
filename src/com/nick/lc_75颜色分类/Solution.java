package com.nick.lc_75颜色分类;

import java.util.Arrays;

/**
 * @author nick
 * @version 1.0, 2021/8/18
 * @since 1.0.0
 */
class Solution {
    public void sortColors(int[] nums) {
        int p0 = 0;
        int p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]){
                case 0 :
                    swap(nums,i,p0);
                    if (p0 < p1){
                        swap(nums, i, p1);
                    }
                    p0++;
                    p1++;
                    break;
                case 1:
                    swap(nums,i,p1);
                    p1++;
                    break;
            }

        }

    }

    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 0, 2, 1, 1, 0};
        new Solution().sortColors1(a);
        System.out.println(Arrays.toString(a));
    }

    public void sortColors1(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(nums, p1++, i);
            }
        }
        for (int i = p1; i < nums.length; i++) {
            if (nums[i] == 1) {
                swap(nums, p1++, i);
            }
        }
    }
}
