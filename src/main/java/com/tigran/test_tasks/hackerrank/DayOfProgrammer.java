package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/17/24
 * Time: 4:15 PM
 */
public class DayOfProgrammer {
    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1918));
        System.out.println(dayOfProgrammer(2017));
    }

    public static String dayOfProgrammer(int year) {
        if (year == 1918) return "26.09.1918";
        if ((year <= 1917 && year % 4 == 0)
                || (year > 1918) && (year % 400 == 0
                || ((year % 4 == 0) & (year % 100 != 0)))) {
            return "12.09." + year;
        }
        return "13.09." + year;
    }

}
