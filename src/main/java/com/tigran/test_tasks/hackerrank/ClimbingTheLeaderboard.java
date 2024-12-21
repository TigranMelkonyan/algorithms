package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/20/24
 * Time: 11:21 PM
 */
public class ClimbingTheLeaderboard {

    public static void main(String[] args) {
        System.out.println(climbingLeaderboard(Arrays.asList(100, 90, 90, 80, 75, 60), Arrays.asList(50, 65, 77, 90, 102)));
        System.out.println(climbingLeaderboard(Arrays.asList(100, 100, 50, 40, 40, 20, 10), Arrays.asList(5, 25, 50, 120)));
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> distinctRanks = new ArrayList<>();
        distinctRanks.add(ranked.get(0));
        for (int i = 1; i < ranked.size(); i++) {
            if (!ranked.get(i).equals(ranked.get(i - 1))) {
                distinctRanks.add(ranked.get(i));
            }
        }

        List<Integer> res = new ArrayList<>();
        int index = distinctRanks.size() - 1;

        for (int score : player) {
            while (index >= 0 && score >= distinctRanks.get(index)) {
                index--;
            }
            res.add(index + 2);
        }
        return res;
    }
}
