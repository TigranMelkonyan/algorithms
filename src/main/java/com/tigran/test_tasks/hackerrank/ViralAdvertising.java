package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/24/24
 * Time: 12:50 PM
 */
public class ViralAdvertising {
    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
        System.out.println(viralAdvertising(4));
        System.out.println(viralAdvertising(3));
    }

    public static int viralAdvertising(int n) {
        int cumulative = 0;
        int liked = 0;
        int shared = 5;

        for (int i = 1; i <= n; i++) {
            if (i != 1) {
                shared = liked * 3;
            }
            liked = (int) Math.floor((double) shared / 2);
            cumulative += liked;
        }
        return cumulative;
    }
}
