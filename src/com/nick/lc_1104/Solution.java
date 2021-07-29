package com.nick.lc_1104;

import java.util.LinkedList;
import java.util.List;

/**
 * @author nick
 * @Classname Solution
 * @Description TODO
 * @Date 2021/7/29 8:49 下午
 * @Created by txiao
 */
class Solution {
    public static List<Integer> pathInZigZagTree(int label) {
        List<Integer> list=new LinkedList<>();
        list.add(0,label);
        while (label>1) {
            int i=getLast(label);
            list.add(0,i);
            label=i;
        }
        return list;
    }

    public static int getLast(int num) {
        int r = 0;
        for (; ; r++) {
            if (num < Math.pow(2, r))
                break;
        }
        System.out.println(r);
        int min = (int) Math.pow(2, (double) r - 1);
        int max = (int) Math.pow(2, r) - 1;
        int index = (min / 2) - 1;
        System.out.println(min);
        System.out.println(max);
        System.out.println(index);
        for (int i = min; i < max-1; i += 2) {
            if (num == i || num == i + 1) {
                break;
            }
            index--;
        }
        System.out.println(index);
        System.out.println("res:"+(min / 2 + index));
        return (min/2+index);
    }

    public static void main(String[] args) {
        System.out.println(pathInZigZagTree(26));
    }
}