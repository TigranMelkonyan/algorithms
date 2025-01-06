package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/6/25
 * Time: 6:30 PM
 */
public class OrganizingContainersOfBalls {
    public static void main(String[] args) {
        List<List<Integer>> container = Arrays.asList(
                Arrays.asList(0, 2, 1),
                Arrays.asList(1, 1, 1),
                Arrays.asList(2, 0, 0)
        );

        System.out.println(organizingContainers(container));

    }

    public static String organizingContainers(List<List<Integer>> container) {
        int n = container.size();

        int[] typeTotals = new int[n];
        int[] containerCapacities = new int[n];

        // Calculate total balls of each type (sum columns)
        // Calculate total capacity of each container (sum rows)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                typeTotals[i] += container.get(j).get(i);
                containerCapacities[i] += container.get(i).get(j);
            }
        }

        Arrays.sort(typeTotals);
        Arrays.sort(containerCapacities);

        // Check if the totals match
        for (int i = 0; i < n; i++) {
            if (typeTotals[i] != containerCapacities[i]) {
                return "Impossible";
            }
        }

        return "Possible";
    }
}
