package com.nick.lc_11盛最多水的容器;

/**
 * @author nick
 * @version 1.0, 2021/8/9
 * @since 1.0.0
 */
class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while (r>l){
            int t = Math.min(height[l],height[r]);
            int m=t*(r-l);
            if (m>max){
                max=m;
            }
            if (height[l]>height[r]){
                r--;
            }else {
                l++;
            }
        }
        return max;
    }
}