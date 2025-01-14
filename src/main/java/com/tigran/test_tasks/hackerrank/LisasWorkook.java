package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/12/25
 * Time: 8:42 PM
 */
public class LisasWorkook {
    public static void main(String[] args) {
        System.out.println(workbook(5, 3, Arrays.asList(4, 2, 6, 1, 10)));
        System.out.println(workbook(10, 5, Arrays.asList(3, 8, 15, 11, 14, 1, 9, 2, 24, 31)));
        System.out.println(workbook(2, 100, Arrays.asList(100, 1)));
    }

    public static int workbook(int n, int k, List<Integer> arr) {
        int res = 0;
        int page = 1;

        for (int i = 0; i < n; i++) {
            int problems = arr.get(i);

            for (int problem = 1; problem <= problems; problem++) {
                if (problem == page) {
                    res++;
                }
                if (problem % k == 0 || problem == problems) {
                    page++;
                }
            }
        }
        return res;
    }
}
