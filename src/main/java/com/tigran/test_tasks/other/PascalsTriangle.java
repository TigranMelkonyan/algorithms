package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 3/4/25
 * Time: 1:56 PM
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> res = generate(5);

        for (int i = 0; i < res.size(); i++) {
            List<Integer> row = res.get(i);
            for (int j = 0; j <= i; j++) {
                System.out.print(row.get(j));
            }
            System.out.println();
        }
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int sum = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                    row.add(sum);
                }
            }
            res.add(row);
        }

        return res;
    }
}
