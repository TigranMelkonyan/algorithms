package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/23/25
 * Time: 4:52 PM
 */
public class IterateGridElementsExcludingCorners {
    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
        grid.add("111111");
        grid.add("100001");
        grid.add("100001");
        grid.add("100001");
        grid.add("111111");

        for (int i = 1; i < grid.size() - 1; i++) {
            for (int j = 1; j < grid.get(0).length(); j++) {
                if (j < grid.get(i).length() - 1) {
                    System.out.print(grid.get(i).charAt(j));
                }
            }
            System.out.println();
        }
    }
}
