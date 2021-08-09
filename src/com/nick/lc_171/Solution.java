package com.nick.lc_171;

/**
 * @author nick
 * @Classname Solution
 * @Description TODO
 * @Date 2021/7/30 4:51 下午
 * @Created by txiao
 */
class Solution {
    public static int titleToNumber(String columnTitle) {
        int weight=1;
        int res=0;
        for (int i = 0; i < columnTitle.length(); i++) {
            res+=getInt(columnTitle.charAt(columnTitle.length()-i-1))*weight;
            weight=(int)Math.pow(26,i+1);
        }
        return res;
    }
    public static int getInt(char ch){
        return (int) ch -64;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
    }
}