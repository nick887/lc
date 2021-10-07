package com.nick.lc_434字符串中的单词数;

class Solution {
    public int countSegments(String s) {
        if (s.equals("")) {
            return 0;
        }
        String[] s1 = s.split(" ");
        return s1.length;
    }
}