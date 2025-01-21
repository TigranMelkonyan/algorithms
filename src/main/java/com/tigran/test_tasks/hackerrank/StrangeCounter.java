package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 1/21/25
 * Time: 12:35 PM
 */
public class StrangeCounter {
    public static void main(String[] args) {
        System.out.println(strangeCounter(7l));
        System.out.println(strangeCounter(4l));
        System.out.println(strangeCounter(3l));
        System.out.println(strangeCounter(5l));
    }

    // [1 2 3 | 4 5 6 7] 8 9  10 11 12 ...
    //  3 2 1   6 5 4 3  2 1   12 11 10 ...

    public static long strangeCounter(long t) {
        long value = 3;
        long time = 1;

        while (time + value - 1 < t) {
            time += value;
            value *= 2;
        }

        return value - (t - time);
    }

}
