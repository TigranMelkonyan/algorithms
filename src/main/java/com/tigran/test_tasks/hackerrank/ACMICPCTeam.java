package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/5/25
 * Time: 4:42 PM
 */
public class ACMICPCTeam {
    public static void main(String[] args) {
        System.out.println(acmTeam(Arrays.asList("11101", "10101", "11001", "10111", "10000", "01110")));
        System.out.println(acmTeam(Arrays.asList("10101", "11100", "11010", "00101")));
    }

    public static List<Integer> acmTeam(List<String> topic) {
        int maxTopics = 0;
        int count = 0;

        for (int i = 0; i < topic.size(); i++) {
            for (int j = i + 1; j < topic.size(); j++) {
                int commonTopics = countCommonTopics(topic.get(i), topic.get(j));

                if (commonTopics > maxTopics) {
                    maxTopics = commonTopics;
                    count = 1;
                } else if (commonTopics == maxTopics) {
                    count++;
                }
            }
        }

        return Arrays.asList(maxTopics, count);
    }

    private static int countCommonTopics(String member1, String member2) {
        int commonTopics = 0;
        for (int i = 0; i < member1.length(); i++) {
            if (member1.charAt(i) == '1' || member2.charAt(i) == '1') {
                commonTopics++;
            }
        }
        return commonTopics;
    }


//    public static List<Integer> acmTeam(List<String> topic) {
//        int max = 0;
//        int count = 0;
//
//        for (int i = 0; i < topic.size(); i++) {
//            for (int j = i + 1; j < topic.size(); j++) {
//                String a = topic.get(i);
//                String b = topic.get(j);
//
//                int sum = Integer.valueOf(a, 2) | Integer.valueOf(b, 2);
//                int val = Integer.bitCount(sum);
//
//                if (val > max) {
//                    max = val;
//                    count = 1;
//                } else if (val == max) {
//                    count++;
//                }
//            }
//        }
//
//        return Arrays.asList(max, count);
//    }
}
