package com.tigran.test_tasks.leetcode;

/**
 * Created by Tigran Melkonyan
 * Date: 2/27/25
 * Time: 4:43 PM
 */
public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(4);
        list1.next.next.next = new ListNode(4);

        ListNode current = mergeTwoLists(list1);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode head) {
        ListNode node = new ListNode();
        ListNode current = node;

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head = head.next;
                continue;
            } else {
                current.next = head;
            }
            head = head.next;
            current = current.next;
        }

        if (head != null) {
            current.next = head;
        }

        return node.next;
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

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
