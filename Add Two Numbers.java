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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (first != null || second != null) {
            int x, y, sum;

            if (first != null)
                x = first.val;
            else
                x = 0;
            if (second != null)
                y = second.val;
            else
                y = 0;

            sum = carry + x + y;
            carry = 0;
            if (sum >= 10)
                carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (first != null)
                first = first.next;
            if (second != null)
                second = second.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }
}