package com.tigran.test_tasks.leetcode;

/**
 * Created by Tigran Melkonyan
 * Date: 2/24/25
 * Time: 8:57 PM
 */
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("XI"));
        System.out.println(romanToInt("V"));
    }

    public static int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = Integer.valueOf(Symbols.getValueBySymbol(String.valueOf(s.charAt(i))));
            int next = 0;

            if (i + 1 < s.length()) {
                next = Integer.valueOf(Symbols.getValueBySymbol(String.valueOf(s.charAt(i + 1))));
            }

            if (curr < next) {
                res -= curr;
            } else {
                res += curr;
            }
        }
        return res;
    }

    enum Symbols {
        I("1"),
        V("5"),
        X("10"),
        L("50"),
        C("100"),
        D("500"),
        M("1000");

        public String value;

        Symbols(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static String getValueBySymbol(String symbol) {
            for (Symbols s : Symbols.values()) {
                if (s.name().equals(symbol)) {
                    return s.getValue();
                }
            }
            return null;
        }
    }
}
