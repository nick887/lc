package com.nick.lc_56合并区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author nick
 * @version 1.0, 2021/8/18
 * @since 1.0.0
 */
class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        int l = 0;
        int r = 1;
        int max;
        do{
            max = intervals[l][1];
            while (r < intervals.length) {
                if (max >= intervals[r][0]) {
                    max = Math.max(max, intervals[r][1]);
                    r++;
                } else {
                    break;
                }
            }
            res.add(new int[]{intervals[l][0], max});
            l = r;
        } while (r < intervals.length);
        return res.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
         int[][] a = new Solution().merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
