package com.nick.面试题10_02;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author nick
 * @Classname Solution
 * @Description TODO
 * @Date 2021/7/18 7:55 下午
 * @Created by txiao
 */
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        System.out.println(convertChapterNums("第一百章"));

    }
    public static int convertChapterNums(String chapterName){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("一",1);
        map.put("二",2);
        map.put("三",3);
        map.put("四",4);
        map.put("五",5);
        map.put("六",6);
        map.put("七",7);
        map.put("八",8);
        map.put("九",9);
        map.put("十",10);
        map.put("百",100);
        map.put("千",1000);
        map.put("万",10000);
        int res=0;
        String t=chapterName.substring(1,chapterName.length()-1);
        for(int i=0;i<t.length();i++){
            if(t.substring(i,i+1)=="零"){
                continue;
            }
            int x=map.get(t.substring(i,i+1));
            if(i+1<t.length()){
                x*=map.get(t.substring(i+1,i+2));
                i++;
            }
            res+=x;
        }
        return res;
    }
}