package com.nick.offer_30包含min函数的栈;

import java.util.Stack;

/**
 * @author nick
 * @version 1.0, 2021/11/17
 * @since 1.0.0
 */
class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> stack1;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        stack1 = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            stack1.push(x);
        } else {
            stack.push(x);
            if (x > stack1.peek()) {
                stack1.push(stack1.peek());
            } else {
                stack1.push(x);
            }
        }
    }

    public void pop() {
        if (!stack.isEmpty() && !stack1.isEmpty()) {
            stack1.pop();
            stack.pop();
        }
    }

    public int top() {
        return stack.isEmpty() ? -1 : stack.peek();
    }

    public int min() {
        return stack1.isEmpty() ? -1 : stack1.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */