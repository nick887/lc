package com.nick.lc_5最长回文子串;

/**
 * @author nick
 * @Classname Solution
 * @Description TODO
 * @Date 2021/8/8 8:06 下午
 * @Created by txiao
 */
class Solution {
    public String longestPalindrome(String s) {
        char[] chars=s.toCharArray();
        int start =0;
        int end = 0;
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            int len1 = centerExpand(i,i,s);
            int len2 = centerExpand(i,i+1,s);
            if (len1>len2){
                if (len1>max){
                    max=len1;
                    start = i-(max-1)/2;
                    end = i+(max-1)/2;
                }
            }else {
                if (len2>max){
                    max=len2;
                    start = i-(max-2)/2;
                    end = i+1+(max-2)/2;
                }
            }
        }
        return s.substring(start,end+1);
    }
    public static int centerExpand(int l , int r , String s){
        while (l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("abba"));
    }
}
