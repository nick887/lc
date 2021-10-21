package com.nick.lc_66加一;

import java.util.Arrays;

/**
 * @author nick
 * @version 1.0, 2021/10/21
 * @since 1.0.0
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int forward = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (forward == 0) {
                break;
            }
            digits[i] += forward;
            if (digits[i] == 10) {
                forward = 1;
                digits[i] = 0;
            } else {
                forward = 0;
            }
        }
        if (forward == 1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                res[i + 1] = digits[i];
            }
            return res;
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{9})));
    }
}