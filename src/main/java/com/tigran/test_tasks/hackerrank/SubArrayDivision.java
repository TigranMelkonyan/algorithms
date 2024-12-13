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

        for (int i = 0; i < n; i++) {
            sum += s.get(i); // Add the current element to the sum
            if (i >= m - 1) { // When we have a complete window
                if (sum == d) {
                    count++;
                }
                sum -= s.get(i - m + 1); // Slide the window by removing the first element
            }
        }
        return count;
    }

}
