package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/23/24
 * Time: 4:40 PM
 */
public class BeautifulDaysMovies {
    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }

    public static int beautifulDays(int i, int j, int k) {
        int bd = 0;

        for(int d = i; d <= j; d++) {
            if(Math.abs(d - rev(d)) % k == 0 ) {
                bd++;
            }
        }
        return bd;
    }

    static int rev(int num) {
        int res = 0;

        while(num != 0) {
            int digit = num % 10;
            res = res * 10 + digit;
            num /= 10;
        }
        return res;
    }
}
