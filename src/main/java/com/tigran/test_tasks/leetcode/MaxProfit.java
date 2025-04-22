package com.tigran.test_tasks.leetcode;

/**
 * Created by Tigran Melkonyan
 * Date: 4/22/25
 * Time: 3:41 PM
 */
public class MaxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{1, 2}));
        System.out.println(maxProfit(new int[]{2, 1, 1}));
        System.out.println(maxProfit(new int[]{2, 1, 2, 1, 0, 1, 2}));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int temp = price - minPrice;
                maxProfit = Math.max(maxProfit, temp);
            }
        }
        return maxProfit;
    }

    public static int maxProfit2Loop(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int temp = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, temp);
            }
        }

        return maxProfit;
    }
}
