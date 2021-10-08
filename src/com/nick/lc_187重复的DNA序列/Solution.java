package com.nick.lc_187重复的DNA序列;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new LinkedList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 9; i++) {
            String sub = s.substring(i, i + 10);
            Integer v ;
            if((v = map.putIfAbsent(sub, 1))!=null){
                map.put(sub,v+1);
            }
        }
        map.forEach((k,v) -> {
            if (v>1){
                res.add(k);
            }
        });
        return res;
    }
}