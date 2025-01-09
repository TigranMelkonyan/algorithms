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
        System.out.println(birthday(Arrays.asList(1, 2, 3, 4), 9, 3));
        System.out.println(birthday(Arrays.asList(1, 2, 3, 1, 2, 7, 3), 6, 3));
        System.out.println(birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2));
        System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
        System.out.println(birthday(Arrays.asList(4), 4, 1));
    }

    //    Sliding Window technique with one loop
    static int birthday(List<Integer> s, int d, int m) {
        int n = s.size();
        int count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += s.get(i);
            if (i >= m - 1) {
                if (sum == d) {
                    count++;
                }
                sum -= s.get(i - m + 1);
            }
        }
        return count;
    }

//    Sliding Window technique with two loop
//    static int birthay(List<Integer> s, int d, int m) {
//        int n = s.size();
//        int count = 0;
//        for (int i = 0; i < n - m + 1; i++) {
//            int sum = 0;
//            for (int j = 0; j < m; j++)
//                sum = sum + s.get(i + j);
//            if (sum == d) {
//                count++;
//            }
//        }
//        return count;
//    }

}
