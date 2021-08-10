package com.nick.lc_34在排序数组中查找元素的第一个和最后一个位置;

/**
 * @author nick
 * @version 1.0, 2021/8/10
 * @since 1.0.0
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int l=0;
        int h = nums.length-1;
        int mid =(l+h)/2;
        while(l<h){
            if(nums[mid]>target){
                h=mid-1;
            }else if (nums[mid]<target){
                l=mid+1;
            }else{
                break;
            }
            mid = (l+h)/2;
        }
        if(nums[mid]!=target){
            return new int[]{-1,-1};
        }
        l=mid;
        h=mid;
        while(l>-1&&nums[l]==target){
            l--;
        }
        while(h<nums.length&&nums[h]==target){
            h++;
        }
        return new int[]{l+1,h-1};
    }
}