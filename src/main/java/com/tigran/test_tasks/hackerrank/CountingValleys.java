package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/19/24
 * Time: 5:23 PM
 */
public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
        System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
        System.out.println(countingValleys(10, "UDUUUDUDDD"));
    }

    public static int countingValleys(int steps, String path) {
        int count = 0;
        int up = 0;
        int down = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                up++;
            } else {
                down++;
            }
            if (up - down == 0 && (path.charAt(i) == 'U')) {
                count++;
                up = 0;
                down = 0;
            }
        }
        return count;
    }

//    public static int countingValleys(int steps, String path) {
//        int count = 0;
//        int elevation = 0;
//
//        for (int i = 0; i < steps; i++) {
//            if (path.charAt(i) == 'U') {
//                elevation++;
//                if(elevation == 0) {
//                    count++;
//                }
//            } else {
//                elevation--;
//            }
//        }
//        return count;
//    }
}
