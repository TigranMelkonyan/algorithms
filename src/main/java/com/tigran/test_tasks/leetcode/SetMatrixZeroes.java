package com.tigran.test_tasks.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tigran Melkonyan
 * Date: 6/25/25
 * Time: 6:12 PM
 */
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 1, 1}};
        setZeroes(matrix);
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        // First pass: mark rows and columns that should be zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        // Second pass: zero out rows
        for (int i : zeroRows) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 0;
            }
        }

        // Zero out columns
        for (int j : zeroCols) {
            for (int i = 0; i < rows; i++) {
                matrix[i][j] = 0;
            }
        }
    }
}
