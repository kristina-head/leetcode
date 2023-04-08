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
    public ListNode removeNthFromEnd(ListNode head, int n) { // O(M) where M is the number of ListNodes in the List
        ListNode newHead = new ListNode(0, head); // O(1)
        ListNode left = newHead; // O(1)
        ListNode right = head; // O(1)
        
        while (n > 0) { // O(N)
            right = right.next; // O(1)
            n--; // O(1)
        }
        
        while (right != null) { // O(M - N)
            left = left.next; // O(1)
            right = right.next; // O(1)
        }
        
        left.next = left.next.next; // O(1)
        
        return newHead.next; // O(1)
    }
}
