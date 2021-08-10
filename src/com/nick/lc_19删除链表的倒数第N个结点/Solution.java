package com.nick.lc_19删除链表的倒数第N个结点;

/**
 * @author nick
 * @version 1.0, 2021/8/9
 * @since 1.0.0
 */


class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static int c;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        c=n;
        ListNode node=new ListNode();
        node.next=head;
        foo(node);
        return node.next;
    }
    public static int foo(ListNode node){
        if (node==null){
            return c;
        }
        int p=foo(node.next);
        if (p==0){
            node.next=node.next.next;
        }else {
            return p-1;
        }
        return -1;
    }
}