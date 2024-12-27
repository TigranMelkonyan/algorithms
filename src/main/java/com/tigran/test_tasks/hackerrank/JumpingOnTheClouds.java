package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/27/24
 * Time: 4:16 PM
 */
public class JumpingOnTheClouds {
    public static void main(String[] args) {        
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
        System.out.println(jumpingOnClouds(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));
    }

    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        int n = c.length;
        int i = 0;

        while (true) {
            i = (i + k) % n;
            e--;
            if (c[i] == 1) {
                e -= 2;
            }
            if (i == 0) {
                break;
            }
        }
        return e;
    }

//    static int jumpingOnClouds(int[] c, int k) {
//        int e = 100; // Initial energy level
//        int n = c.length; // Number of clouds
//        int i = 0; // Starting position
//
//        do {
//            // Jump to the next cloud
//            i = (i + k) % n;
//
//            // Deduct energy for the jump
//            e--;
//
//            // Deduct additional energy if it's a thundercloud
//            if (c[i] == 1) {
//                e -= 2;
//            }
//        } while (i != 0); // Stop when back at the starting position
//
//        return e;
//    }
}
