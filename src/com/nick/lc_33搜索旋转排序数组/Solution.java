package com.nick.lc_33搜索旋转排序数组;

/**
 * @author nick
 * @version 1.0, 2021/8/10
 * @since 1.0.0
 */
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        int mid = (l+h)/2;
        while(l<h){
            if (target>nums[nums.length-1]){
                if (nums[mid]<nums[nums.length-1]){
                    h=mid-1;
                }else {
                    if (nums[mid]<target){
                        l=mid+1;
                    }else if (nums[mid]>target){
                        h=mid-1;
                    }else {
                        break;
                    }
                }
            }else {
                if (nums[mid]<nums[nums.length-1]){
                    if (nums[mid]<target){
                        l=mid+1;
                    }else if (nums[mid]>target){
                        h=mid-1;
                    }else {
                        break;
                    }
                }else {
                    l=mid+1;
                }
            }
            mid=(l+h)/2;
        }
        if (nums[mid]==target){
            return mid;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[]{3,4,1,2},4));
    }
}