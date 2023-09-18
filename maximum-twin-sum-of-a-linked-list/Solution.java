/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode tail = null;
        int maxTwinSum = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        while (slow != null) {
            ListNode newNode = new ListNode(slow.val, tail);
            tail = newNode;

            slow = slow.next;
        }

        while (tail != null) {
            int twinSum = head.val + tail.val;
            maxTwinSum = Math.max(twinSum, maxTwinSum);

            head = head.next;
            tail = tail.next;
        }

        return maxTwinSum;
    }
}
