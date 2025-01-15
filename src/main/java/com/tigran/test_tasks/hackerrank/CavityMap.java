package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/14/25
 * Time: 4:33 PM
 */
public class CavityMap {
    public static void main(String[] args) {
        System.out.println(cavityMap(Arrays.asList("1112", "1912", "1892", "1234")));
    }

    public static List<String> cavityMap(List<String> grid) {
        List<String> res = new ArrayList<>();
        //    up     down    righ    left
        // {-1, 0}, {1, 0}, {0, 1}, {0, -1}
        int n = grid.size();
        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = grid.get(i).toCharArray();
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                char currEl = matrix[i][j];

                if (currEl > matrix[i - 1][j] &&
                        currEl > matrix[i + 1][j] &&
                        currEl > matrix[i][j + 1] &&
                        currEl > matrix[i][j - 1]
                ) {
                    matrix[i][j] = 'X';
                }

            }
        }

        for (int i = 0; i < n; i++) {
            res.add(new String(matrix[i]));
        }

        return res;
    }
    

//    public static List<String> cavityMap(List<String> grid) {
//        int n = grid.size();
//        List<String> result = new ArrayList<>(grid);
//
//        for (int i = 1; i < n - 1; i++) {
//            StringBuilder row = new StringBuilder(grid.get(i));
//            for (int j = 1; j < row.length() - 1; j++) {
//                int current = grid.get(i).charAt(j) - '0';
//                int top = grid.get(i - 1).charAt(j) - '0';
//                int bottom = grid.get(i + 1).charAt(j) - '0';
//                int left = grid.get(i).charAt(j - 1) - '0';
//                int right = grid.get(i).charAt(j + 1) - '0';
//
//                if (current > top && current > bottom && current > left && current > right) {
//                    row.setCharAt(j, 'X');
//                }
//            }
//            result.set(i, row.toString());
//        }
//
//        return result;
//    }
}
