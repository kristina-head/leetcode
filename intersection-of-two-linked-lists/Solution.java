/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) { // O(A + B) where A is the no. of ListNodes in headA and B is the no. of ListNodes in headB
        if (headA == null || headB == null) return null; // O(1)
        
        ListNode nodeA = headA; // O(1)
        ListNode nodeB = headB; // O(1)
        
        while (nodeA != nodeB) { // O(A + B)
            nodeA = (nodeA == null) ? headB : nodeA.next; // O(1)
            nodeB = (nodeB == null) ? headA : nodeB.next; // O(1)
        }
        
        return nodeA; // O(1)
    }
}
