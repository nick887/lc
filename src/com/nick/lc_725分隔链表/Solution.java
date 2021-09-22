package com.nick.lc_725分隔链表;

import java.util.Arrays;
import java.util.List;

/**
 * @author nick
 * @version 1.0, 2021/9/22
 * @since 1.0.0
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode t = head;
        while (t.next != null) {
            t = t.next;
            length++;
        }
        ListNode[] res = new ListNode[k];
        int subL = length / k;
        if (subL == 0) {
            t = head;
            for (int i = 0; i < length; i++) {
                t = foo(res, 1, t, i);
            }
        }
        int remainder = length % subL;
        t = head;
        for (int i = 0; i < remainder; i++) {
            t = foo(res, subL, t, i);
        }
        for (int i = remainder; i < k; i++) {
            t = foo(res, subL, t, i);
        }
        return res;
    }

    public static ListNode foo(ListNode[] res, int subL, ListNode head, int index) {
        ListNode t = head;
        ListNode t1;
        for (int i = 0; i < subL; i++) {
            t = t.next;
        }
        t1 = t.next;
        t.next = null;
        res[index] = t;
        return t1;
    }


}