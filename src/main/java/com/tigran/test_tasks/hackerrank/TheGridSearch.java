package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/20/25
 * Time: 2:12 PM
 */
public class TheGridSearch {
    public static void main(String[] args) {
        System.out.println(gridSearch(Arrays.asList(
                        "7283455864",
                        "6731158619",
                        "8988242643",
                        "3830589324",
                        "2229505813",
                        "5633845374",
                        "6473530293",
                        "7053106601",
                        "0834282956",
                        "4607924137"),
                Arrays.asList("9505", "3845", "3530")));
        System.out.println(gridSearch(Arrays.asList(
                        "400453592126560",
                        "114213133098692",
                        "474386082879648",
                        "522356951189169",
                        "887109450487496",
                        "252802633388782",
                        "502771484966748",
                        "075975207693780",
                        "511799789562806",
                        "404007454272504",
                        "549043809916080",
                        "962410809534811",
                        "445893523733475",
                        "768705303214174",
                        "650629270887160",
                        "4607924137"),
                Arrays.asList("99", "99")));
    }


    public static String gridSearch(List<String> G, List<String> P) {
        int n = G.size();
        int p = P.size();

        for (int i = 0; i <= n - p; i++) {
            String gridRow = G.get(i);
            int startIndex = gridRow.indexOf(P.get(0));

            while (startIndex != -1) {
                boolean match = true;

                for (int j = 1; j < p; j++) {
                    if (!G.get(i + j).startsWith(P.get(j), startIndex)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    return "YES";
                }

                startIndex = gridRow.indexOf(P.get(0), startIndex + 1);
            }
        }

        return "NO";
    }
}

//    public static String gridSearch(List<String> G, List<String> P) {
//        String firstPattern = P.get(0);
//        int startIndex = -1;
//        int rowIndex = -1;
//
//        for (int i = 0; i < G.size(); i++) {
//            startIndex = G.get(i).indexOf(firstPattern);
//            if (startIndex != -1) {
//                rowIndex = i;
//                break;
//            }
//        }
//
//        if (startIndex == -1) {
//            return "NO";
//        }
//
//        for (int i = 1; i < P.size(); i++) {
//            if (rowIndex + i >= G.size()) {
//                return "NO";
//            }
//
//            String gridRow = G.get(rowIndex + i);
//            String patternRow = P.get(i);
//
//            if (!gridRow.startsWith(patternRow, startIndex)) {
//                return "NO";
//            }
//        }
//
//        return "YES";
//    }
