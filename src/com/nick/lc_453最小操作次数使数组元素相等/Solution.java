package com.nick.lc_453最小操作次数使数组元素相等;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * @author nick
 * @version 1.0, 2021/10/20
 * @since 1.0.0
 */
class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        Arrays.stream(nums).forEach(c -> pq.add(c));
        while (true) {
            int a = pq.poll();
            if (a > min) {
                res += (a - min);
                pq.add(min);
            } else {
                break;
            }
        }
        return res;
    }
}