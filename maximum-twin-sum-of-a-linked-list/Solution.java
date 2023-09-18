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
    public int pairSum(ListNode head) { // O(N)
        ListNode slow = head; // O(1)
        ListNode fast = head.next; // O(1)
        ListNode tail = null; // O(1)
        int maxTwinSum = 0; // O(1)

        while (fast != null && fast.next != null) { // O(N)
            slow = slow.next; // O(1)
            fast = fast.next.next; // O(1)
        }

        while (slow != null) { // O(N / 2)
            ListNode newNode = new ListNode(slow.val, tail); // O(1)
            tail = newNode; // O(1)

            slow = slow.next; // O(1)
        }

        while (tail != null) { // O(N / 2)
            int twinSum = head.val + tail.val; // O(1)
            maxTwinSum = Math.max(twinSum, maxTwinSum); // O(1)

            head = head.next; // O(1)
            tail = tail.next; // O(1)
        }

        return maxTwinSum; // O(1)
    }
}
