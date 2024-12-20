package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/20/24
 * Time: 3:49 PM
 */
public class FormingAMagicSquare {

    public static void main(String[] args) {
        List<List<Integer>> s = Arrays.asList(
                Arrays.asList(4, 8, 2),
                Arrays.asList(6, 1, 7),
                Arrays.asList(3, 9, 5)
        );

        int result = formingMagicSquare(s);

        System.out.println("Minimum cost to form a magic square: " + result);
    }

    private static final int[][][] MAGIC_SQUARES = {
            {
                    {8, 1, 6},
                    {3, 5, 7},
                    {4, 9, 2}
            },
            {
                    {6, 1, 8},
                    {7, 5, 3},
                    {2, 9, 4}
            },
            {
                    {4, 9, 2},
                    {3, 5, 7},
                    {8, 1, 6}
            },
            {
                    {2, 9, 4},
                    {7, 5, 3},
                    {6, 1, 8}
            },
            {
                    {8, 3, 4},
                    {1, 5, 9},
                    {6, 7, 2}
            },
            {
                    {4, 3, 8},
                    {9, 5, 1},
                    {2, 7, 6}
            },
            {
                    {6, 7, 2},
                    {1, 5, 9},
                    {8, 3, 4}
            },
            {
                    {2, 7, 6},
                    {9, 5, 1},
                    {4, 3, 8}
            }
    };

    public static int formingMagicSquare(List<List<Integer>> s) {
        int[][] input = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                input[i][j] = s.get(i).get(j);
            }
        }

        int minCost = Integer.MAX_VALUE;

        for (int[][] magicSquare : MAGIC_SQUARES) {
            int cost = 0;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    cost += Math.abs(input[i][j] - magicSquare[i][j]);
                }
            }

            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }
}
