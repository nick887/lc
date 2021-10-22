package com.nick.lc_229求众数;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author nick
 * @version 1.0, 2021/10/22
 * @since 1.0.0
 */
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer integer = map.get(nums[i]);
                map.put(nums[i], ++integer);
                if (integer > nums.length / 3) {
                    if (list.size() == 1 && list.get(0) != nums[i]) {
                        list.add(nums[i]);
                    } else if (list.size() == 0) {
                        list.add(nums[i]);
                    }
                }
            } else {
                map.put(nums[i], 1);
                if (1 > nums.length/3) {
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }
}