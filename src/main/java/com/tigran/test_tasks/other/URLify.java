package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 6/18/25
 * Time: 5:20 PM
 */
public class URLify {
    public static void main(String[] args) {
        String input = "Mr John Smith    ";
        int trueLength = 13;

        char[] str = input.toCharArray();
        replaceSpaces(str, trueLength);

        System.out.println(new String(str));
    }

    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0;

        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        int index = trueLength + spaceCount * 2;
        if (index > str.length) return;

        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }
}
