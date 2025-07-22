package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 7/22/25
 * Time: 3:31 PM
 */
public class MinimumNumberOfArrowsToBurstBalloons {
    public static void main(String[] args) {
        System.out.println(minimumNumberOfArrowsToBurstBalloons(new int[][]{
                {10, 16},
                {2, 8},
                {1, 6},
                {7, 12}}));
    }

    public static int minimumNumberOfArrowsToBurstBalloons(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int end = points[0][1];
        int arrows = 1;

        //[1, 6] [2, 8] [7, 12] [10, 16]
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1];
            }
        }

        return arrows;
    }
}
