package com.nick.lc_239滑动窗口最大值;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author nick
 * @version 1.0, 2021/9/21
 * @since 1.0.0
 */
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        PriorityQueue<Integer> pA = new PriorityQueue<>((o1, o2) -> o2 - o1);
        PriorityQueue<Integer> pL = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < k; i++) {
            pA.add(nums[i]);
        }
        res[0] = pA.peek();
        for (int i = k; i < nums.length; i++) {
            pL.add(nums[i - k]);
            pA.add(nums[i]);
            while (pA.peek().equals(pL.peek())) {
                pA.poll();
                pL.poll();
            }
            res[i - k + 1] = pA.peek();
        }
        return res;
    }
}
