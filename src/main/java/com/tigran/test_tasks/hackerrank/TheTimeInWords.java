package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 1/11/25
 * Time: 1:39 PM
 */
public class TheTimeInWords {

    private static final String[] NUMBERS = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty",
            "thirty one", "thirty two", "thirty three", "thirty four", "thirty five", "thirty six",
            "thirty seven", "thirty eight", "thirty nine", "forty", "forty one", "forty two", "forty three",
            "forty four", "forty five", "forty six", "forty seven", "forty eight", "forty nine", "fifty",
            "fifty one", "fifty two", "fifty three", "fifty four", "fifty five", "fifty six", "fifty seven",
            "fifty eight", "fifty nine"
    };

    public static void main(String[] args) {
        System.out.println(timeInWords(5, 0));
        System.out.println(timeInWords(5, 1));
        System.out.println(timeInWords(5, 10));
        System.out.println(timeInWords(5, 15));
        System.out.println(timeInWords(5, 30));
        System.out.println(timeInWords(7, 29));
    }

    public static String timeInWords(int h, int m) {
        if (m == 0) {
            // Exact hour
            return NUMBERS[h] + " o' clock";
        } else if (m == 15) {
            // Quarter past
            return "quarter past " + NUMBERS[h];
        } else if (m == 30) {
            // Half past
            return "half past " + NUMBERS[h];
        } else if (m == 45) {
            // Quarter to next hour
            return "quarter to " + NUMBERS[h + 1];
        } else if (m < 30) {
            // "X minutes past Y"
            if (m == 1) {
                return "one minute past " + NUMBERS[h];
            } else {
                return NUMBERS[m] + " minutes past " + NUMBERS[h];
            }
        } else {
            // "X minutes to next hour"
            int nextHour = (h == 12) ? 1 : h + 1;
            int minutesToNextHour = 60 - m;
            if (minutesToNextHour == 1) {
                return "one minute to " + NUMBERS[nextHour];
            } else {
                return NUMBERS[minutesToNextHour] + " minutes to " + NUMBERS[nextHour];
            }
        }
    }
}
