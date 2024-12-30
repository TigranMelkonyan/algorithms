package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/30/24
 * Time: 11:12 AM
 */
public class FindZeroPointAfterSteps {
    public static void main(String[] args) {
        System.out.println(findZeroPointAfterSteps(6, 2));
    }

    public static int findZeroPointAfterSteps(int n, int step) {
        int count = 0;
        int i = 0;

        do {
            i = (i + step) % n;
            count++;
        } while (i != 0);
        return count;
    }
    
    
}
