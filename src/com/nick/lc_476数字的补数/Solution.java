package com.nick.lc_476数字的补数;

/**
 * @author nick
 * @version 1.0, 2021/10/18
 * @since 1.0.0
 */
class Solution {
    public int findComplement(int num) {
        int res = 0;
        System.out.println(Integer.toBinaryString(num));
        for (int i = 0; i < 32; i++) {
            int t = 1 << i;
            System.out.println("t:  "+Integer.toBinaryString(t));
            if ((t & num) == t) {
            } else {
                res = res | t;
            }
            System.out.println("res:   "+Integer.toBinaryString(res));
            if ((t | num) > num){
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findComplement(5));
    }
}