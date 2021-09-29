package com.nick.lc_326_3的幂;

/**
 * @author nick
 * @version 1.0, 2021/9/23
 * @since 1.0.0
 */
class Solution {
    public boolean isPowerOfThree(int n) {
        int i = 0;
        long res ;
        while ((res = (long) Math.pow(3,i)) < Integer.MAX_VALUE) {
            if (res == n) {
                return true;
            }
            i++;
        }
        return false;
    }
}
