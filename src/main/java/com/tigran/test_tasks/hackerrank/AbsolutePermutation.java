package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/21/25
 * Time: 5:21 PM
 */
public class AbsolutePermutation {
    public static void main(String[] args) {
        System.out.println(absolutePermutation(2, 1));
        System.out.println(absolutePermutation(3, 0));
        System.out.println(absolutePermutation(3, 2));
        System.out.println(absolutePermutation(4, 2));
    }

    public static List<Integer> absolutePermutation(int n, int k) {
        List<Integer> result = new ArrayList<>();

        if (k == 0) {
            for (int i = 1; i <= n; i++) {
                result.add(i);
            }
            return result;
        }

        if (n % (2 * k) != 0) {
            return Collections.singletonList(-1);
        }

        for (int i = 1; i <= n; i++) {
            if ((i - 1) / k % 2 == 0) {
                result.add(i + k);
            } else {
                result.add(i - k);
            }
        }

        return result;
    }
}
