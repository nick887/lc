package com.nick.lc_38外观数列;

/**
 * @author nick
 * @version 1.0, 2021/10/15
 * @since 1.0.0
 */
class Solution {
    public String countAndSay(int n) {
        return foo("1",n);
    }

    public String foo(String a ,int n ) {
        if (n == 1 ){
            return a;
        }else {
            int count = 0;
            StringBuffer sb = new StringBuffer();
            Character c = a.charAt(0);
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == c){
                    count++;
                }else {
                    sb.append(Integer.toString(count)+c);
                    c = a.charAt(i);
                    count = 1;
                }
            }
            if (count !=0){
                sb.append(Integer.toString(count)+c);
            }
            System.out.println(sb);
            return foo(sb.toString(),n-1);
        }
    }
}
