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
    public ListNode reverseList(ListNode head) { // O(N) where N is the number of nodes in the list
        ListNode newHead = head; // O(1)
        
        while (head != null && head.next != null) { // O(N)
            ListNode node = new ListNode(head.next.val, newHead); // O(1)
            head.next = head.next.next; // O(1)
            newHead = node; // O(1)
        }
        
        return newHead; // O(1)
    }
}
