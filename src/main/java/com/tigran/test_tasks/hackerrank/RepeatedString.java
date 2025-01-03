package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 1/3/25
 * Time: 3:29 PM
 */
public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 9));
        System.out.println(repeatedString("aba", 11));
        System.out.println(repeatedString("aab", 8));
        System.out.println(repeatedString("abc", 11));
        System.out.println(repeatedString("a", 100000));
    }

    //My solution
    public static long repeatedString(String s, long n) {
        long count = 0;
        long l = s.length();
        int r = (int) (n % l);
        int rem = 0;

        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == 'a') {
                count++;
                if (i < r && s.substring(0, r).charAt(i) == 'a') {
                    rem++;
                }
            }
        }
        return (n / l) * count + rem;
    }

//    public static long repeatedString(String s, long n) {
//        long count = 0;
//        long l = s.length();
//        long fullRepeats = n / l;
//        long remainder = n % l;
//
//        // Count 'a' in the given string
//        for (int i = 0; i < l; i++) {
//            if (s.charAt(i) == 'a') {
//                count++;
//            }
//        }
//
//        // Count 'a' in the remaining part
//        long remCount = 0;
//        for (int i = 0; i < remainder; i++) {
//            if (s.charAt(i) == 'a') {
//                remCount++;
//            }
//        }
//        return fullRepeats * count + remCount;
//    }
}
