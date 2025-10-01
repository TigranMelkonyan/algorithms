package com.tigran.test_tasks.other;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Created by Tigran Melkonyan
 * Date: 9/29/25
 * Time: 12:58 PM
 */
public class DailyTemperature {

    public static void main(String[] args) {
        Arrays.stream(dailyTemperatures(new int[]{75, 71, 69, 72, 76, 73})).forEach(System.out::println);
    }

    public static int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] res = new int[n];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && t[i] > t[deque.peek()]) {
                int j = deque.pop();
                res[j] = i - j;
            }
            deque.push(i);  
        }

        return res;
    }

    public static int[] dailyTemperatures2(int[] t) {
        int n = t.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (t[j] > t[i]) {
                    ans[i] = j - i;
                    break;
                }
            }
        }

        return ans;
    }
}
