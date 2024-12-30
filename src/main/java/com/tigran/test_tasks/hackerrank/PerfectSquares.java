package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/30/24
 * Time: 4:12 PM
 */
public class PerfectSquares {

    public static void main(String[] args) {
        System.out.println(findSquares(10, 55));
    }

    public static List<Integer> findSquares(int a, int b) {
        List<Integer> perfectSquares = new ArrayList<>();

        // Find the smallest integer whose square is >= a
        int start = (int) Math.ceil(Math.sqrt(a));

        // Find the largest integer whose square is <= b
        int end = (int) Math.floor(Math.sqrt(b));

        // If start is greater than end, there are no perfect squares in the range
        if (start > end) {
            return perfectSquares; // return empty list
        }

        // Collect the perfect squares between start and end
        for (int i = start; i <= end; i++) {
            perfectSquares.add(i * i); // Add the square of the integer i to the list
        }

        return perfectSquares;
    }

//    public static List<Integer> squares(int a, int b) {
//        List<Integer> res = new ArrayList<>();
//
//        for (int i = a; i <= b; i++) {
//            double temp = Math.sqrt(i);
//            if (temp == Math.floor(temp)) {
//                res.add(i);
//            }
//        }
//
//        return res;
//    }
}
