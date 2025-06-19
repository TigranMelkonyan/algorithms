package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 6/19/25
 * Time: 2:55 PM
 */
public class TreeDepth {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.right.right = new TreeNode(4);

        System.out.println(maxDepth(tree, 0));
    }

    public static int maxDepth(TreeNode root, int maxDepth) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left, maxDepth + 1);
        int rightDepth = maxDepth(root.right, maxDepth + 1);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
