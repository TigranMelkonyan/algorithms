package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 1/13/25
 * Time: 12:39 PM
 */
public class FlatlandSpaceStations {
    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations(95, new int[]{68, 81, 46, 54, 30, 11, 19, 23, 22, 12, 38, 91, 48, 75, 26, 86, 29, 83, 62}));
        System.out.println(flatlandSpaceStations(5, new int[]{0, 4}));
        System.out.println(flatlandSpaceStations(20, new int[]{13, 1, 11, 10, 6}));
    }

    // 0 '1' 2 3 4 5 '6' 7 8 9 '10' '11' 12 '13' 14 15 16 17 18 19
    // '0' 1 2 3 '4' 
    static int flatlandSpaceStations(int n, int[] c) {
        Arrays.sort(c); // Sort the space station positions
        int maxDistance = 0;

        // Case 1: Cities before the first space station
        maxDistance = Math.max(maxDistance, c[0]);

        // Case 2: Cities between space stations
        for (int i = 1; i < c.length; i++) {
            int distance = (c[i] - c[i - 1]) / 2;
            maxDistance = Math.max(maxDistance, distance);
        }

        // Case 3: Cities after the last space station
        maxDistance = Math.max(maxDistance, n - 1 - c[c.length - 1]);

        return maxDistance;
    }
}
