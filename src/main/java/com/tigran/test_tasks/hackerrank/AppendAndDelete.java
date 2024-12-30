package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/30/24
 * Time: 12:41 PM
 */
public class AppendAndDelete {

    public static void main(String[] args) {
        System.out.println(appendAndDelete("abc", "def", 6));
        System.out.println(appendAndDelete("ashley", "ash", 2));
        System.out.println(appendAndDelete("aba", "aba", 7));
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
        System.out.println(appendAndDelete("zzzzz", "zzzzzzz", 2));
    }

    public static String appendAndDelete(String s, String t, int k) {
        int commonLength = 0;
        
        // Find the length of the common prefix
        while (commonLength < s.length() && commonLength < t.length()
                && s.charAt(commonLength) == t.charAt(commonLength)) {
            commonLength++;
        }

        // Calculate the minimum operations required
        int operations = (s.length() - commonLength) + (t.length() - commonLength);

        // Check if the operations are achievable within k
        if (operations > k) {
            return "No";
        }

        // Check if the remaining moves allow full overwrite or extra operations
        if ((k - operations) % 2 == 0 || k >= s.length() + t.length()) {
            return "Yes";
        }

        return "No";
    }
}
