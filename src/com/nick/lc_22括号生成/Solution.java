package com.nick.lc_22括号生成;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nick
 * @version 1.0, 2021/8/10
 * @since 1.0.0
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        dfs("",n,n,res);
        return res;
    }
    private void dfs(String s,int left , int right , List<String> res){
        if (left==0&&right==0){
            res.add(s);
            return;
        }
        if (left>right || left<0 || right<0){
            return;
        }

        dfs(s+"(",left-1,right,res);
        dfs(s+")",left,right-1,res);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(3));
    }
}