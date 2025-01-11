package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/11/25
 * Time: 4:31 PM
 */
public class ServiceLine {
    public static void main(String[] args) {
        int n = 8;
        List<List<Integer>> cases = Arrays.asList(
                Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3),
                Arrays.asList(0, 3),
                Arrays.asList(4, 6),
                Arrays.asList(6, 7),
                Arrays.asList(3, 5),
                Arrays.asList(0, 7)
        );
        System.out.println(serviceLane(n, cases));
    }

    public static List<Integer> serviceLane(int n, List<List<Integer>> cases) {
        List<Integer> result = new ArrayList<>();
        List<Integer> widths = cases.get(0);

        for (int i = 1; i < cases.size(); i++) {
            int start = cases.get(i).get(0);
            int end = cases.get(i).get(1);
            
            int min = Integer.MAX_VALUE;
            for (int j = start; j <= end; j++) {
                min = Math.min(min, widths.get(j));
            }
            result.add(min);
        }

        return result;
    }
}
