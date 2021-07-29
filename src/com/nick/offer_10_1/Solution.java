package com.nick.offer_10_1;

import java.util.HashMap;

/**
 * @author nick
 * @Classname Solution
 * @Description TODO
 * @Date 2021/7/16 9:45 下午
 * @Created by txiao
 */
class Solution {
    int[] a={0,1};
    public int fib(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        for (int i = 0; i < n-1; i++) {
            int t=a[0]+a[1];
            t=t>1000000007?t%1000000007:t;
            a[0]=a[1];
            a[1]=t;
        }
        return a[2];
    }
}
