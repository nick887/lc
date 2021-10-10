package com.nick.lc_441排列硬币;

class Solution {
    public int arrangeCoins(int n) {
        int res = 1;
        while (n > 0) {
            n -= res;
            res++;
        }
        res--;
        return n == 0 ? res : res - 1;
    }
}