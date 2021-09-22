package com.nick.lc_6Z字形变换;

/**
 * @author nick
 * @version 1.0, 2021/9/18
 * @since 1.0.0
 */
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int down;
        int up;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            down = (numRows - 1 - i) * 2;
            up = i * 2;
            boolean reverse = true;
            int j = i;
            while (j < s.length()) {
                int l = reverse ? down : up;
                if (l == 0) {
                    reverse = !reverse;
                    continue;
                }
                stringBuilder.append(s.charAt(j));
                j += l;
                reverse = !reverse;
            }
        }
        return stringBuilder.toString();
    }
}