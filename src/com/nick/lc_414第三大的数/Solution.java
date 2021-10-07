package com.nick.lc_414第三大的数;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x));
        for (int num : nums) {
            if (!pq.stream().allMatch(c -> c != num)) {
                continue;
            }
            if (pq.isEmpty()) {
                pq.offer(num);
                continue;
            }
            if (num > pq.peek() && pq.size() == 3 ) {
                pq.poll();
                pq.offer(num);
            } else  if (pq.size() < 3){
                pq.offer(num);
            }
        }
        return pq.size() == 3 ? pq.peek() : pq.stream().max(Comparator.comparingInt(x -> x)).get();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().thirdMax(new int[]{5,2,4,1,3,6,0}));
    }
}