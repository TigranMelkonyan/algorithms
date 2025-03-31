package com.tigran.test_tasks.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Tigran Melkonyan
 * Date: 3/25/25
 * Time: 5:57 PM
 */
public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        //         1
        //          \
        //           2
        //          /
        //         3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);


        List<Integer> recursiveResult = inorderTraversal(root);
        System.out.println(recursiveResult);

        List<Integer> iterativeResult = inorderTraversalIterative(root);
        System.out.println("Iterative Inorder Traversal: " + iterativeResult);
    }

    // Recursive Inorder Traversal
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderHelper(root, res);
        return res;
    }

    private static void inorderHelper(TreeNode node, List<Integer> res) {
        if (node == null) return;
        inorderHelper(node.left, res);  // Left
        res.add(node.val);              // Root
        inorderHelper(node.right, res); // Right
    }


    // Iterative Inorder Traversal
    public static List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;  // Move left
            }
            curr = stack.pop();
            res.add(curr.val);  // Visit node
            curr = curr.right;  // Move right
        }
        return res;
    }

}


class TreeNode {
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
