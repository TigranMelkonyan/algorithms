package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 1/6/25
 * Time: 9:40 PM
 */
public class Encryption {
    public static void main(String[] args) {
        System.out.println(encryption("have anic eday"));
        System.out.println(encryption("iffact sdontf ittoth eorych angeth efacts"));
    }

    //My version
    public static String encryption(String s) {
        StringBuilder res = new StringBuilder();
        s = s.replace(" ", "");
        int n = s.length();

        double sqr = Math.sqrt(n);
        int col = (int) Math.ceil(sqr);

        for (int i = 0; i < col; i++) {
            for (int j = i; j < n; j += col) {
                res.append(s.charAt(j));
            }
            res.append(" ");
        }
        return res.toString();
    }

//    public static String encryption(String s) {
//        s = s.replace(" ", "");
//        int n = s.length();
//
//        int col = (int) Math.ceil(Math.sqrt(n));
//        int row = (int) Math.floor(Math.sqrt(n));
//        if (row * col < n) row++; // Ensure the grid can fit all characters
//
//        List<String> rows = new ArrayList<>();
//        for (int i = 0; i < col; i++) {
//            StringBuilder encryptedRow = new StringBuilder();
//            for (int j = i; j < n; j += col) {
//                encryptedRow.append(s.charAt(j));
//            }
//            rows.add(encryptedRow.toString());
//        }
//
//        return String.join(" ", rows);
//    }
}
