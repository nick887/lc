package com.nick.lc_482密钥格式化;

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            if (count == k) {
                sb.insert(0,'-');
                count = 0;
            }
            if (s.charAt(i) != '-') {
                sb.insert(0,Character.toUpperCase(s.charAt(i)));
                count++;
            }
        }
        String res = sb.toString();
        if(res.charAt(0) == '-') {
            res = res.substring(1);
        }
        if (s.charAt(res.length() - 1) == '-') {
            res = res.substring(0,res.length() -1);
        }
        return res;
    }
}