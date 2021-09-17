package com.nick.lc_3寻找两个正序数组的中位数;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author nick
 * @version 1.0, 2021/9/12
 * @since 1.0.0
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (i < nums1.length || j <nums2.length) {
            if (i == nums1.length) {
                arrayList.add(nums2[j++]);
            }else if (j == nums2.length) {
                arrayList.add(nums1[i++]);
            }else {
                if (nums1[i]>nums2[j]){
                    arrayList.add(nums1[i++]);
                }else {
                    arrayList.add(nums2[j++]);
                }
            }
        }
        Integer[] integers = arrayList.toArray(new Integer[arrayList.size()]);
        System.out.println(Arrays.toString(integers));
        if (integers.length%2 == 0) {
            return integers[integers.length/2];
        }
        double res = (integers[integers.length/2] + integers[integers.length/2+1])/2;
        return res;
    }
}
