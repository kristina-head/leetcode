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
    public ListNode removeElements(ListNode head, int val) { // O(N) where N is the number of nodes in the list
        while (head != null && head.val == val) { // O(N)
            head = head.next; // O(1)
        }
        
        if (head == null) return head; // O(1)
        
        ListNode prev = head; // O(1)
        ListNode node = head.next; // O(1)
        
        while (node != null) { // O(N)
            if (node.val == val) { // O(1)
                prev.next = node.next; // O(1)
            } else {
                prev = node; // O(1)
            }
            
            node = node.next; // O(1)
        }
        
        return head; // O(1)
    }
}
