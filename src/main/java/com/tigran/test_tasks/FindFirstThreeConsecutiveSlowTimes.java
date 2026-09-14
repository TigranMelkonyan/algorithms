package com.tigran.test_tasks;

import java.util.List;

public class FindFirstThreeConsecutiveSlowTimes {
    public static void main(String[] args) {
        System.out.println(firstThreeConsecutiveSlow(List.of(120, 130, 125, 400, 410, 415, 140, 150)));
    }

    public static int firstThreeConsecutiveSlow(List<Integer> responseTimes) {
        final int slowRespTime = 400;
        int consecutive = 0;

        for (int i = 0; i < responseTimes.size(); i++) {
            if (responseTimes.get(i) >= slowRespTime) {
                consecutive++;
            } else {
                consecutive = 0;
            }

            if (consecutive == 3) {
                return i;
            }
        }

        return -1;
    }
}
