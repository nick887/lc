package com.nick.lc_352将数据流变为多个不相交区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class SummaryRanges {

    private List<List<Integer>> res;
    private Set<Integer> set;
    private HashMap<Integer, List<Integer>> map;

    public SummaryRanges() {
        res = new ArrayList<>();
        set = new HashSet<>();
        map = new HashMap<>();
    }

    public void addNum(int val) {
        if (!(set.contains(val - 1) || set.contains(val + 1))) {
            List<Integer> list = new LinkedList<>() {{
                add(val);
                add(val);
            }};
            res.add(list);
            set.add(val);
            map.put(val,list);
            return;
        }
        while (set.contains(val - 1) || set.contains(val + 1)) {
            List<Integer> a = map.containsKey(val - 1) ? map.get(val - 1) : map.get(val + 1);
            merge(a, val);
        }
    }

    public int[][] getIntervals() {
       return res.stream().map(c -> c.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
    }

    public void merge(List<Integer> a, Integer b) {
        if (b == a.get(1) + 1) {
            set.remove(a.get(1));
            a.remove(1);
            a.add(b);
            set.add(b);
        } else if (b == a.get(0) - 1) {
            set.remove(a.get(0));
            a.remove(0);
            a.add(0, b);
            set.add(b);
        }
    }
}
