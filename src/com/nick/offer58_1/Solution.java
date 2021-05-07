package com.nick.offer58_1;

import java.util.Arrays;

/**
 * @author nick
 * @Classname Solution
 * @Description TODO
 * @Date 2021/5/7 7:12 下午
 * @Created by txiao
 */
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuffer res=new StringBuffer();

        int i=s.length()-1;
        for (int k = s.length()-1; k >-1; k--) {
            if(s.charAt(k)==' '&&s.charAt(i)==' ')
            {
                continue;
            }
            else if(s.charAt(k)!=' '&&s.charAt(i)==' ')
            {
                i=k;
            }
            else if(s.charAt(k)==' '&&s.charAt(i)!=' ')
            {
                res.append(s.substring(k+1,i+1));
                res.append(" ");
                i=k;
            }
            else if(s.charAt(k)!=' '&&s.charAt(i)!=' ')
            {
                continue;
            }
        }
        res.append(s.substring(0,i+1));
        return res.toString().substring(0,res.length()-1);
    }

    public static void main(String[] args) {
        System.out.println("abcdef".substring(0,2));
    }
}
