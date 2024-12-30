package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/30/24
 * Time: 3:58 PM
 */
public class SherlockAndSquares {

    public static void main(String[] args) {
        System.out.println(squares(24, 49));
    }

    public static int squares(int a, int b) {
        // Find the smallest integer whose square is >= a
        int start = (int) Math.ceil(Math.sqrt(a));

        // Find the largest integer whose square is <= b
        int end = (int) Math.floor(Math.sqrt(b));

        // If start is greater than end, there are no perfect squares in the range
        if (start > end) {
            return 0;
        }

        // The count of perfect squares is the number of integers between start and end (inclusive)
        return end - start + 1;
    }
    
//    public static int squares(int a, int b) {
//        int count = 0;
//
//        for(int i = a; i <= b; i++) {
//            double temp = Math.sqrt(i);
//            if(temp == Math.floor(temp)) {
//                count++;
//            }
//        }
//
//        return count;
//    }
}
