package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/30/25
 * Time: 5:25 PM
 */
public class Iterate2dArrayCorner {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };

        for (int i = 0; i < Math.min(arr.length, arr[0].length); i++) {
            arr[i][i] = 1;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


        System.out.println();
        // WIth string corner
        List<String> grid = new ArrayList<>();
        grid.add("0000");
        grid.add("0000");
        grid.add("0000");
        grid.add("0000");

        for (int i = 0; i < grid.size(); i++) {
            StringBuilder sb = new StringBuilder(grid.get(i));
            sb.setCharAt(i, 'X');
            grid.set(i, sb.toString());
        }

        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(0).length(); j++) {
                System.out.print(grid.get(i).charAt(j));
            }
            System.out.println();
        }
    }
}
