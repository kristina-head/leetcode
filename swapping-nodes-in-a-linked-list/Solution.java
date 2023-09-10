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
    public ListNode swapNodes(ListNode head, int k) { // O(N)
        ListNode kthFromBeginning = head; // O(1)
        ListNode kthFromEnd = head; // O(1)
        ListNode node = head; // O(1)
        int size = 0; // O(1)

        while (node != null) { // O(N)
            if (++size == k) kthFromBeginning = node; // O(1)
            node = node.next; // O(1)
        }

        for (int i = 1; i <= size - k; i++) { // O(N)
            kthFromEnd = kthFromEnd.next; // O(1)
        }

        int temp = kthFromBeginning.val; // O(1)
        kthFromBeginning.val = kthFromEnd.val; // O(1)
        kthFromEnd.val = temp; // O(1)

        return head; // O(1)
    }
}
