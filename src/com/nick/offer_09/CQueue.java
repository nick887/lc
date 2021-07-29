package com.nick.offer_09;

import java.util.Stack;

/**
 * @author nick
 * @Classname CQueue
 * @Description TODO
 * @Date 2021/7/16 9:39 下午
 * @Created by txiao
 */
class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public CQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.add(stack1.pop());
            }
            if (stack2.isEmpty()){
                return -1;
            }
            return stack2.pop();
        }else {
            return stack2.pop();
        }
    }
}