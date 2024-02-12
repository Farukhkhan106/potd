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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        int mid;
        ListNode dummy = new ListNode(0);
        ListNode prev = head;
        while (head != null) {
            head = head.next;
            size++;
        }

        mid = (size / 2) + 1;
        int i = 1;
        while (i < mid) {
            prev = prev.next;
            i++;
        }
        dummy.next = prev;
        return dummy.next;
    }
}