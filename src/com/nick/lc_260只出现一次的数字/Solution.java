package com.nick.lc_260只出现一次的数字;

import java.util.HashMap;
import java.util.stream.Stream;

class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.computeIfPresent(i, (k, v) -> v + 1);
            } else {
                map.put(i, 1);
            }
        }
        int[] as = map.entrySet().stream().filter(c -> c.getValue() == 1).map(c -> c.getKey()).mapToInt(c -> c).toArray();
        return as;
    }
}