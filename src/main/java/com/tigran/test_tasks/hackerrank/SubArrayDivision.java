package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/13/24
 * Time: 4:32 PM
 */
public class SubArrayDivision {
    public static void main(String[] args) {
        System.out.println(foo(Arrays.asList(1, 2, 3, 5, 9, 7, 3, 1), 4, 3));
        System.out.println(foo(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2));
        System.out.println(foo(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
        System.out.println(foo(Arrays.asList(4), 4, 1));
    }

    static int foo(List<Integer> s, int d, int m) {
        int n = s.size();
        int count = 0;
        int sum = 0;

        if (n < m) {
            return 0;
        }
        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }
        if (sum == d) {
            count++;
        }
        for (int i = m; i < n; i++) {
            sum = sum - s.get(i - m) + s.get(i);
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

}
