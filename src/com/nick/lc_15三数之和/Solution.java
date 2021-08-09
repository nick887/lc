package com.nick.lc_15三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author nick
 * @version 1.0, 2021/8/9
 * @since 1.0.0
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for (int first = 0; first < nums.length; first++) {
            if (nums[first]>0){
                break;
            }
            if (first > 0 && nums[first]==nums[first-1]){
                continue;
            }
            int target = -nums[first];
            int third = nums.length-1;
            for (int second = first+1; second < nums.length; second++) {
                if (second>first+1 && nums[second]==nums[second-1]){
                    continue;
                }
                while (second<third && nums[second]+nums[third]>target){
                    --third;
                }
                if (second==third){
                    break;
                }
                if (nums[second]+nums[third] == target){
                    List<Integer>list1 =new ArrayList<>();
                    list1.add(nums[second]);
                    list1.add(nums[third]);
                    list1.add(nums[first]);
                    list.add(list1);
                }
            }
        }
        return list;
    }
}
