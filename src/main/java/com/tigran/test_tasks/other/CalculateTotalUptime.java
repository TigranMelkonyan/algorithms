package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 4/15/25
 * Time: 5:37 PM
 */
public class CalculateTotalUptime {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {4, 7},
                {6, 8},
                {9, 10},
                {10, 12}
        };
        System.out.println("Total Uptime: " + calculateTotalUptime(intervals));
    }

    public static int calculateTotalUptime(int[][] intervals) {
        Arrays.sort(intervals, (a0, a1) -> Integer.compare(a0[1], a1[1]));

        int totalUptime = 0;
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (end >= intervals[i][0]) {
                end = Math.max(end, intervals[i][1]);
            } else {
                totalUptime += end - start;
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        totalUptime += end - start;
        return totalUptime;
    }
}
