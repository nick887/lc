package com.nick.lc_79单词搜索;

import java.util.Arrays;

/**
 * @author nick
 * @version 1.0, 2021/8/20
 * @since 1.0.0
 */
public class Solution {
    public boolean exist(char[][] board, String word) {
        int[][] f = new int[][]{{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(new boolean[board.length][board[0].length], board, 0, word, i, j, f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(boolean[][] isVisited, char[][] board, int index, String word, int i, int j, int[][] f) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i > board.length - 1) {
            return false;
        }
        if (j < 0 || j > board[0].length - 1) {
            return false;
        }
        if (board[i][j] == word.charAt(index) && !isVisited[i][j]) {
            isVisited[i][j] = true;
            for (int k = 0; k < f.length; k++) {
                int ti = i + f[k][0];
                int tj = j + f[k][1];
                if (dfs(isVisited, board, index + 1, word, ti, tj, f)) {
                    return true;
                }
            }
            isVisited[i][j]=false;
        }
        return false;
    }

    public static void main(String[] args) {
        new Solution().exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCESEEEFS");
    }
}
