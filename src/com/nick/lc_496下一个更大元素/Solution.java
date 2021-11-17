package com.nick.lc_496下一个更大元素;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author nick
 * @version 1.0, 2021/10/26
 * @since 1.0.0
 */
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            Integer idx = map.get(nums1[i]);
            res[i] = -1;
            for (int j = idx; j < nums2.length; j++) {
                if(nums2[j] > nums1[i]) {
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}