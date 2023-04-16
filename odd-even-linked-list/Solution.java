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
    public ListNode oddEvenList(ListNode head) { // O(N) where N is the number of ListNodes in the list
        if (head == null) return head; // O(1)

        ListNode odd = head; // O(1)
        ListNode even = head.next; // O(1)
        ListNode evenHead = even; // O(1)

        while (even != null && even.next != null) { // O(N)
            odd.next = even.next; // O(1)
            odd = odd.next; // O(1)
            even.next = odd.next; // O(1)
            even = even.next; // O(1)
        }

        odd.next = evenHead; // O(1)

        return head; // O(1)
    }
}
