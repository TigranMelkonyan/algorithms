package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/11/24
 * Time: 12:54 PM
 */
public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("07:05:45AM"));
    }

    public static String timeConversion(String s) {
        String res = s;
        String col = ":";
        String[] sp = s.split(col);
        String hh = sp[0];
        String mm = sp[1];
        String ss = sp[2];
        int temp;

        if (s.contains("AM")) {
            ss = ss.replace("AM", "");
            if (s.startsWith("12")) {
                res = "00" + col + mm + col + ss;
            } else {
                res = hh + col + mm + col + ss;
            }
        }

        if (s.contains("PM")) {
            ss = ss.replace("PM", "");
            if (s.startsWith("12")) {
                res = "12" + col + mm + col + ss;
            } else {
                temp = Integer.parseInt(hh) + 12;
                res = temp + col + mm + col + ss;
            }
        }

        return res;
    }
}
