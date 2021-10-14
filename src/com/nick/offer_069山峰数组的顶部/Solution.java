package com.nick.offer_069山峰数组的顶部;

/**
 * @author nick
 * @version 1.0, 2021/10/14
 * @since 1.0.0
 */
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int mid = (l + r) / 2;
        while (!(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])) {
            if (arr[mid] < arr[mid + 1]) {
                l = mid;
                mid = (l + r) / 2;
            } else {
                r = mid;
                mid = (l + r) / 2;
            }
        }
        return mid;
    }
}
