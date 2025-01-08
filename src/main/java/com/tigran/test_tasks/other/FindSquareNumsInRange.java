package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/8/25
 * Time: 4:53 PM
 */
public class FindSquareNumsInRange {
    public static void main(String[] args) {
        System.out.println(findPerfectSquares(10, 36));
    }

    public static List<Integer> findPerfectSquares(int a, int b) {
        List<Integer> perfectSquares = new ArrayList<>();

        int start = (int) Math.ceil(Math.sqrt(a));
        int end = (int) Math.floor(Math.sqrt(b));

        if (start > end) {
            return perfectSquares;
        }

        for (int i = start; i <= end; i++) {
            perfectSquares.add(i * i);
        }

        return perfectSquares;
    }
}
