package com.nick.lc_139单词拆分;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author nick
 * @version 1.0, 2021/9/17
 * @since 1.0.0
 */
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp =new boolean[s.length()+1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
