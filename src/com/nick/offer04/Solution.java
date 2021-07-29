package com.nick.offer04;

/**
 * @author nick
 * @Classname Solution
 * @Description TODO
 * @Date 2021/7/18 7:47 下午
 * @Created by txiao
 */
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length==0)
            return false;
        int i=0;
        int j=matrix[0].length-1;
        while (true){
            if (i>matrix.length-1)
                return false;
            if (j<0)
                return false;
            if (matrix[i][j]<target)
                j--;
            else if (matrix[i][j]>target)
                i++;
            else if (matrix[i][j]==target)
                return true;
        }
    }
}
