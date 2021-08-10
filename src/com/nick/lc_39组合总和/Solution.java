package com.nick.lc_39组合总和;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author nick
 * @version 1.0, 2021/8/10
 * @since 1.0.0
 */
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new LinkedList<>();
        dfs(list,new LinkedList<>(),candidates,target);
        return list;
    }
    private void dfs(List<List<Integer>> list,List<Integer> l,int[] candidates,int cur){
        if(cur==0){
            list.add(l);
            return;
        }
        if(cur<0){
            return;
        }
        for(int i=0;i<candidates.length;i++){
            int index=i;

            dfs(list,new LinkedList<Integer>(l){{add(candidates[index]);}},Arrays.copyOfRange(candidates,i,candidates.length),cur-candidates[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().combinationSum(new int[]{2,3,6,7},7));
    }
}