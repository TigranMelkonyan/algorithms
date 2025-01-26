package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/23/25
 * Time: 1:22 PM
 */
public class EmasSupercomputer {

    public static void main(String[] args) {
        List<String> grid1 = new ArrayList<>(Arrays.asList(
                "GGGGGGG",
                "BGBBBBG",
                "BGBBBBG",
                "GGGGGGG",
                "GGGGGGG",
                "BGBBBBG"));

        System.out.println(twoPluses(grid1));
        List<String> grid2 = new ArrayList<>(Arrays.asList(
                "BGBBGB",
                "GGGGGG",
                "BGBBGB",
                "GGGGGG",
                "BGBBGB",
                "BGBBGB"));
        List<String> grid = new ArrayList<>(Arrays.asList(
                "BGBBGB",
                "GGGGGG",
                "BGBBGB",
                "GGGGGG",
                "BGBBGB",
                "BGBBGB"));

        System.out.println(twoPluses(grid));

        System.out.println(twoPluses(grid2));
    }

    public static int twoPluses(List<String> grid) {
        int rows = grid.size();
        int cols = grid.get(0).length();
        int maxProduct = 0;

        // Store sizes of pluses at each cell
        int[][] plusSizes = new int[rows][cols];

        // Calculate the maximum size of pluses for each cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid.get(i).charAt(j) == 'G') {
                    plusSizes[i][j] = calculatePlusSize(grid, i, j);
                }
            }
        }

        // Try all pairs of pluses
        for (int i1 = 0; i1 < rows; i1++) {
            for (int j1 = 0; j1 < cols; j1++) {
                for (int size1 = plusSizes[i1][j1]; size1 > 0; size1--) {
                    // Mark the first plus on the grid
                    boolean[][] occupied = markPlus(grid, i1, j1, size1, true);

                    for (int i2 = 0; i2 < rows; i2++) {
                        for (int j2 = 0; j2 < cols; j2++) {
                            for (int size2 = plusSizes[i2][j2]; size2 > 0; size2--) {
                                if (canPlacePlus(occupied, i2, j2, size2)) {
                                    int product = (4 * (size1 - 1) + 1) * (4 * (size2 - 1) + 1);
                                    maxProduct = Math.max(maxProduct, product);
                                }
                            }
                        }
                    }

                    // Unmark the first plus
                    markPlus(grid, i1, j1, size1, false);
                }
            }
        }

        return maxProduct;
    }

    // Calculate the maximum size of a plus centered at (x, y)
    private static int calculatePlusSize(List<String> grid, int x, int y) {
        int size = 0;
        int rows = grid.size();
        int cols = grid.get(0).length();

        while (x - size >= 0 && x + size < rows &&
                y - size >= 0 && y + size < cols &&
                grid.get(x - size).charAt(y) == 'G' &&
                grid.get(x + size).charAt(y) == 'G' &&
                grid.get(x).charAt(y - size) == 'G' &&
                grid.get(x).charAt(y + size) == 'G') {
            size++;
        }

        return size;
    }

    // Mark or unmark a plus on the grid
    private static boolean[][] markPlus(List<String> grid, int x, int y, int size, boolean mark) {
        boolean[][] occupied = new boolean[grid.size()][grid.get(0).length()];

        for (int i = 0; i < size; i++) {
            occupied[x - i][y] = mark;
            occupied[x + i][y] = mark;
            occupied[x][y - i] = mark;
            occupied[x][y + i] = mark;
        }

        return occupied;
    }

    // Check if a plus of a given size can be placed without overlapping
    private static boolean canPlacePlus(boolean[][] occupied, int x, int y, int size) {
        for (int i = 0; i < size; i++) {
            if (occupied[x - i][y] || occupied[x + i][y] || occupied[x][y - i] || occupied[x][y + i]) {
                return false;
            }
        }
        return true;
    }
}
