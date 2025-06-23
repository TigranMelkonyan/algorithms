package com.tigran.test_tasks.leetcode;

/**
 * Created by Tigran Melkonyan
 * Date: 6/19/25
 * Time: 3:01 PM
 */
public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(4);

        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return (left.val == right.val) &&
                isMirror(left.left, right.right) &&
                isMirror(left.right, right.left);
    }
}
