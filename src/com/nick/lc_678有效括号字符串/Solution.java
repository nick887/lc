package com.nick.lc_678有效括号字符串;

import java.util.Stack;

/**
 * @author nick
 * @version 1.0, 2021/9/12
 * @since 1.0.0
 */
class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> ls = new Stack<>();
        Stack<Integer> starS = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '*':
                    starS.push(i);
                case '(':
                    ls.push(i);
                case ')':
                    if (!ls.isEmpty()) {
                        ls.pop();
                    }else if (!starS.isEmpty()){
                        starS.pop();
                    }else {
                        return false;
                    }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        System.out.println(new Solution().checkValidString(s));
    }
}