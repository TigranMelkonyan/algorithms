package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Tigran Melkonyan
 * Date: 1/4/25
 * Time: 4:35 PM
 */
public class QueensAttack {
    public static void main(String[] args) {
        System.out.println(queensAttack(5, 3, 4, 3,
                Arrays.asList(Arrays.asList(5, 5), Arrays.asList(4, 2), Arrays.asList(2, 3))));
    }

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        int attackableSquares = 0;

        // Direction vectors for queen's movements
        int[][] directions = {
                {-1, 0}, // Up
                {1, 0},  // Down
                {0, -1}, // Left
                {0, 1},  // Right
                {-1, -1}, // Up-Left
                {-1, 1},  // Up-Right
                {1, -1}, // Down-Left
                {1, 1}   // Down-Right
        };

        Set<String> obstacleSet = new HashSet<>();
        for (List<Integer> obstacle : obstacles) {
            obstacleSet.add(obstacle.get(0) + "," + obstacle.get(1));
        }

        for (int[] direction : directions) {
            int row = r_q;
            int col = c_q;

            while (true) {
                // Move in the current direction
                row += direction[0];
                col += direction[1];

                // Check if the position is out of bounds
                if (row < 1 || row > n || col < 1 || col > n) {
                    break;
                }

                // Check if the position is blocked by an obstacle
                if (obstacleSet.contains(row + "," + col)) {
                    break;
                }
                attackableSquares++;
            }
        }
        return attackableSquares;
    }
}
