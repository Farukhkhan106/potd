/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0, i = 1;
        ListNode curr = head;
        if (head == null || head.next == null) {
            return null;
        }

        while (curr != null) {
            curr = curr.next;
            size++;
        }
        int a = size - n;
        ListNode prev = head;
        if (n == size) {
            return head.next;
        }
        while (i < a) {
            prev = prev.next;
            i++;
        }
        if (prev.next.next == null) {
            prev.next = null;
        } else
            prev.next = prev.next.next;
        return head;
    }
}