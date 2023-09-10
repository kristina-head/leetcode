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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode kthFromBeginning = head;
        ListNode kthFromEnd = head;
        ListNode node = head;
        int size = 0;

        while (node != null) {
            if (++size == k) kthFromBeginning = node;
            node = node.next;
        }

        for (int i = 1; i <= size - k; i++) {
            kthFromEnd = kthFromEnd.next;
        }

        int temp = kthFromBeginning.val;
        kthFromBeginning.val = kthFromEnd.val;
        kthFromEnd.val = temp;

        return head;
    }
}
