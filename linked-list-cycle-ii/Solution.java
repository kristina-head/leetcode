/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) { // O(N) where N is the no. of nodes in the List
        ListNode slow = head; // O(1)
        ListNode fast = head; // O(1)

        while (fast != null && fast.next != null) { // O(N)
            slow = slow.next; // O(1)
            fast = fast.next.next; // O(1)

            if (slow == fast) { // O(1)
                slow = head; // O(1)

                while (slow != fast) { // O(N)
                    slow = slow.next; // O(1)
                    fast = fast.next; // O(1)
                }

                return slow; // O(1)
            }
        }

        return null; // O(1)
    }
}
