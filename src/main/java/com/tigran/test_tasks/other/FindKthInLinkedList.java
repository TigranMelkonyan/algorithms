package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 6/27/25
 * Time: 5:37 PM
 */
public class FindKthInLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode res = findKthToLast(head, 2);

        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode findKthToLast(ListNode head, int k) {
        if (head == null || k <= 0) return null;

        ListNode fast = head;
        ListNode slow = head;

        // Move fast pointer k nodes ahead
        // Creating exact k gap between fast and slow points
        for (int i = 0; i < k; i++) {
            if (fast == null) return null; // k is larger than list length
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
