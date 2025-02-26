package com.tigran.test_tasks.leetcode;

/**
 * Created by Tigran Melkonyan
 * Date: 2/24/25
 * Time: 5:58 PM
 */
public class PunishmentNumber {

    //10   '1' * 1  1 + 0 = '1'   and '9' * 9 = 81  8 + 1 = '9' valid
    public static void main(String[] args) {
        System.out.println(punishmentNumber(10));
        System.out.println(punishmentNumber(37));
    }

    public static int punishmentNumber(int n) {
        int punishmentNum = 0;

        for (int i = 1; i <= n; i++) {
            int square = i * i;

            if (canPartition(String.valueOf(square), 0, i)) {
                punishmentNum += square;
            }
        }

        return punishmentNum;
    }

    public static boolean canPartition(String num, int index, int target) {
        if (index == num.length()) {
            return target == 0;
        }
        int sum = 0;
        for (int i = index; i < num.length(); i++) {
            sum = sum * 10 + (num.charAt(i) - '0');
            if (sum > target) break;

            if (canPartition(num, i + 1, target - sum)) {
                return true;
            }
        }

        return false;
    }
}
