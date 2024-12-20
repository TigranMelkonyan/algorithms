package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 12/20/24
 * Time: 12:55 PM
 */
public class ElectronicsShop {
    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10));
        System.out.println(getMoneySpent(new int[]{4}, new int[]{5}, 2));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int maxBudget = -1;
        int i = 0, j = drives.length - 1;

        while (i < keyboards.length && j >= 0) {
            int total = keyboards[i] + drives[j];
            if (total > b) {
                j--;
            } else {
                maxBudget = Math.max(maxBudget, total);
                i++;
            }
        }
        return maxBudget;
    }


//    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
//        int maxBudget = 0;
//
//        for (final int keyboard : keyboards) {
//            for (final int drive : drives) {
//                int temp = keyboard + drive;
//                if (temp <= b && temp > maxBudget) {
//                    maxBudget = temp;
//                }
//            }
//        }
//        return maxBudget == 0 ? -1 : maxBudget;
//    }

}
