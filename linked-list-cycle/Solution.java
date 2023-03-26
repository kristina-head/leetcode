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
    public boolean hasCycle(ListNode head) { // O(N) where N is the no. of ListNodes in the Linked List
        ListNode slow = head; // O(1)
        ListNode fast = head; // O(1)
        
        while (fast != null && fast.next != null) { // O(N)
            slow = slow.next; // O(1)
            fast = fast.next.next; // O(1)
            
            if (slow == fast) return true; // O(1)
        }
        
        return false; // O(1)
    }
}
