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
        System.out.println(coinChange2(new int[]{1, 10}, 11));
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

    public static int coinChange2(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
            
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }

        return amount == 0 ? count : -1;
    }
}
