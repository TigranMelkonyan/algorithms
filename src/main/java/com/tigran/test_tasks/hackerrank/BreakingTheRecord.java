package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/12/24
 * Time: 5:52 PM
 */
public class BreakingTheRecord {

    public static void main(String[] args) {
        System.out.println(breakingRecords(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1)));
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int hScore = scores.get(0);
        int lScore = scores.get(0);
        int bestRecCount = 0;
        int worsRecCount = 0;

        for (int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score > hScore) {
                hScore = score;
                bestRecCount++;
            }
            if (score < lScore) {
                lScore = score;
                worsRecCount++;
            }
        }
        return Arrays.asList(bestRecCount, worsRecCount);
    }
}
