package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 1/10/25
 * Time: 3:30 PM
 */
public class HalloweenSale {
    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 85));
        System.out.println(howManyGames(20, 3, 6, 80));
        System.out.println(howManyGames(16, 2, 1, 9981));
    }

    //20 17 14 11 8 [6] 6  6  6
    public static int howManyGames(int p, int d, int m, int s) {
        int res = 0;
        int currentCost = p;
        int totalSpent = 0;

        while (totalSpent + currentCost <= s) {
            totalSpent += currentCost;
            res++;

            if (currentCost - d > m) {
                currentCost -= d;
            } else {
                currentCost = m;
            }
        }
        return res;
    }

}
