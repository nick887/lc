package com.nick.lc_17电话号码的字母组合;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author nick
 * @version 1.0, 2021/8/9
 * @since 1.0.0
 */
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list=new LinkedList<>();
        Map<Character,String> map=new HashMap<>(){{
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");
        }};
        if (digits.equals("")){
            return list;
        }
        foo(map,list,digits,0,null);
        return list;
    }

     void foo(Map<Character,String> map,List<String> list,String d,int index,StringBuffer sb){
        if (index==d.length()-1){
            String t=map.get(d.charAt(index));
            for (int i = 0; i < t.length(); i++) {
                StringBuffer stringBuffer =new StringBuffer();
                if (sb!=null){
                    stringBuffer.append(sb);
                }
                stringBuffer.append(t.charAt(i));
                list.add(stringBuffer.toString());
            }
            return;
        }else {
            String t=map.get(d.charAt(index));
            for (int i = 0; i < t.length(); i++) {
                StringBuffer stringBuffer =new StringBuffer();
                if (sb!=null){
                    stringBuffer.append(sb);
                }
                stringBuffer.append(t.charAt(i));
                foo(map,list,d,index+1,stringBuffer);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations(""));
    }
}