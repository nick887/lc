package com.nick.offer11;

import java.util.Map;

/**
 * @author nick
 * @Classname Solution
 * @Description TODO
 * @Date 2021/5/14 8:40 下午
 * @Created by txiao
 */
class Solution {
    public int minArray(int[] numbers) {
        return getMinNumber(numbers,0,numbers.length-1);
    }
    public int getMinNumber(int[] numbers,int l,int r)
    {
        if(numbers[r]>numbers[l])
            return numbers[l];
        int base=numbers[r];
        int mid=(l+r)/2;
        while (r>l+1)
        {
            if(numbers[mid]>base)
                l=mid;
            else if(numbers[mid]==base)
            {
                return Math.min(getMinNumber(numbers,l,mid),getMinNumber(numbers,mid,r));
            }
            else
                r=mid;
            mid=(l+r)/2;
        }
        return numbers[r];
    }
}