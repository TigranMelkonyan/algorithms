package com.tigran.test_tasks.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tigran Melkonyan
 * Date: 2/27/25
 * Time: 4:43 PM
 */
public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(3);

        ListNode result = removeDuplicatesFromSortedList(list);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode removeDuplicatesFromSortedList(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
       
        return head;
    }

    public static ListNode removeDuplicatesFromUnsortedList(ListNode head) {
        if (head == null) return null;

        Set<Integer> seen = new HashSet<>();
        ListNode current = head;
        seen.add(current.val);

        while (current.next != null) {
            if (seen.contains(current.next.val)) {
                // Duplicate: skip it
                current.next = current.next.next;
            } else {
                seen.add(current.next.val);
                current = current.next;
            }
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }
}
