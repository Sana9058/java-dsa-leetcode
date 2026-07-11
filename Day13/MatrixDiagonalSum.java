// Day 13 – Matrix Diagonal Sum
// LeetCode Problem: Matrix Diagonal Sum
// Difficulty: Easy
// https://leetcode.com/problems/matrix-diagonal-sum/
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {

            // Primary Diagonal
            sum += mat[i][i];

            // Secondary Diagonal
            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - 1 - i];
            }
        }
        return sum;
    }
}
