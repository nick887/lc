package com.nick.lc_405数字转16进制数;

import java.util.Stack;

/**
 * @author nick
 * @version 1.0, 2021/10/2
 * @since 1.0.0
 */
class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuffer buffer = new StringBuffer();
        Stack<String> stack = new Stack<>();
        int a = 0xf;
        while (num != 0) {
            System.out.println(Integer.toBinaryString(num));
            int t = a & num;
            buffer.insert(0, Integer.toHexString(t));
            num = num >>> 4;
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        // System.out.println(new Solution().toHex(-1));
        // System.out.println(Integer.toHexString(-1));
        int a = -1;
        for (int i = 0; i < 4; i++) {
            System.out.println(Integer.toBinaryString(a));
            a = a << 4;
        }
    }
}