package com.nick.lc_500键盘行;

import java.util.*;
import java.util.stream.Stream;

class Solution {
    public String[] findWords(String[] words) {
        String a1 = "qwertyuiop";
        String a2 = "asdfghjkl";
        String a3 = "zxcvbnm";
        String[] a4 = new String[]{a1, a2, a3};
        List<String> list = new LinkedList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a4.length; i++) {
            for (int j = 0; j < a4[i].length(); j++) {
                map.put(a4[i].charAt(j), i);
            }
        }
        for (String word : words) {
            String a = word.toLowerCase(Locale.ROOT);
            int l = map.get(a.charAt(0));
            int count = 1;
            for (int i = 1; i < a.length(); i++) {
                if (map.get(a.charAt(i)) != l) {
                    break;
                }
                count++;
            }
            if (count == a.length()) {
                list.add(word);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }
}