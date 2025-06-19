package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 6/19/25
 * Time: 2:55 PM
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
