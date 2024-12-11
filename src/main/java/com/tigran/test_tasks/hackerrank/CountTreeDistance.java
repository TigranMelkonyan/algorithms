package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/11/24
 * Time: 4:01 PM
 */
public class CountTreeDistance {
    public static void main(String[] args) {
        countApplesAndOranges(7, 10, 4, 12, Arrays.asList(2, 3, -4), Arrays.asList(3, -2, -4));
        countApplesAndOranges(4, 8, 4, 12, Arrays.asList(2, 3, -4, -5, 9), Arrays.asList(3, -2, -4));
    }

    public static void countApplesAndOranges(
            int s, int t, int a, int b,
            List<Integer> apples, List<Integer> oranges) {
        int appleFall = 0;
        int orangeFall = 0;
        int size = Math.max(apples.size(), oranges.size());

        for (int i = 0; i < size; i++) {
            if (i < apples.size() && apples.get(i) + a >= s && apples.get(i) + a <= t) {
                appleFall++;
            }
            if (i < oranges.size() && oranges.get(i) + b >= s && oranges.get(i) + b <= t) {
                orangeFall++;
            }
        }
        System.out.println(appleFall + "\n" + orangeFall);
    }
}
