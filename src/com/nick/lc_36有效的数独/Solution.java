package com.nick.lc_36有效的数独;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author nick
 * @version 1.0, 2021/9/17
 * @since 1.0.0
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Character[][] characters = Arrays.stream(board).map(c -> IntStream.range(0, c.length).mapToObj(i -> c[i]).toArray(Character[]::new)).toArray(Character[][]::new);
        Set<Character>[] rowSets = new HashSet[9];
        Set<Character>[] columnSets = new HashSet[9];
        Set<Character>[][] squareSets = new HashSet[3][3];
        for (int i = 0; i < 9; i++) {
            rowSets[i] = new HashSet();
            columnSets[i] = new HashSet<>();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                squareSets[i][j] = new HashSet<>();
            }
        }
        if (squareSets[0][0].add(characters[0][0])) {
            System.out.println("no");
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int y = i / 3;
                int x = j / 3;
                if (squareSets[y][x].add(characters[i][j]) || rowSets[i].add(characters[i][j]) || columnSets[j].add(characters[i][j])) {
                    System.out.println(characters[i][j]);
                    return false;
                }
            }
        }
        return true;
    }
}