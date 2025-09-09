package com.tigran.test_tasks.leetcode.dp;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 1/2/25
 * Time: 2:25 PM
 */
public class CoinChange {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{3, 1}, 6));
        System.out.println(coinChange(new int[]{1, 2, 5, 9}, 11));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    //another solution O(n log n + nA)
    //n is the number of coins (coin denominations).
    //A is the target amount.
    public static int coinChange2(int[] coins, int amount) {
        Arrays.sort(coins);
        int coinCount = 0;

        // Try to use the largest coin denomination
        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= amount) {
                coinCount += amount / coins[i];   // Use as many of this coin as possible
                amount %= coins[i];               // Reduce the remaining amount
            }
        }

        return amount == 0 ? coinCount : -1;  // If we couldn't make exact change, return -1
    }
}
