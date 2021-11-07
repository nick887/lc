package com.nick.lc_598范围求和;

/**
 * @author nick
 * @version 1.0, 2021/11/7
 * @since 1.0.0
 */
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int rowM = Integer.MAX_VALUE;
        int colM = Integer.MAX_VALUE;
        for (int i = 0; i < ops.length; i++) {
            rowM = Math.min(rowM, ops[i][0]);
            colM = Math.min(colM, ops[i][1]);
        }
        if (rowM == Integer.MAX_VALUE || colM == Integer.MAX_VALUE){
            return m*n;
        }
        return rowM * colM;
    }
}