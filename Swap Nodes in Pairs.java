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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        while (head != null && head.next != null) {
            ListNode fast = head.next;
            ListNode slow = head;
            prev.next = fast;
            slow.next = fast.next;
            fast.next = slow;
            prev = slow;
            head = slow.next;
        }
        return dummy.next;
    }
}