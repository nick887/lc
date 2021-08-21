package com.nick.lc_96不同的二叉搜索树;

/**
 * @author nick
 * @version 1.0, 2021/8/21
 * @since 1.0.0
 */
public class Solution {
    public int numTrees(int n) {
        int[] d = new int[n + 1];
        d[0] = 1;
        d[1] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j < i; ++j) {
                d[i] += d[j - 1] * d[i - j];
            }
        }
        return d[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numTrees(19));
    }
}
