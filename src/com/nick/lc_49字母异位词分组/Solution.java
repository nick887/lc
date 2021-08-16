package com.nick.lc_49字母异位词分组;

import java.util.*;

/**
 * @author nick
 * @version 1.0, 2021/8/16
 * @since 1.0.0
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, LinkedList<String>> map = new HashMap<>();
        for (String str : strs){
            char[] bytes = str.toCharArray();
            Arrays.sort(bytes);
            LinkedList<String> list = map.getOrDefault(new String(bytes), new LinkedList<>());
            list.add(str);
            map.put(new String(bytes), list);
        }
        List<List<String>> res = new LinkedList<>();
        for (Map.Entry<String , LinkedList<String>> e : map.entrySet()){
            res.add(e.getValue());
        }
        return res;
    }

}
