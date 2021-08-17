package com.nick.lc_55跳跃游戏;

/**
 * @author nick
 * @version 1.0, 2021/8/17
 * @since 1.0.0
 */
class Solution {
    public boolean canJump(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > index) {
                return false;
            }
            int n =nums[i] + i;
            index = n > index ? n : index;
        }
        return true;
    }


    public static void main(String[] args) {

    }
}
