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
    public ListNode swapPairs(ListNode head) { // O(N) where N is the number of ListNodes in the linked list
        if (head == null || head.next == null) return head; // O(1)

        ListNode first = head; // O(1)
        ListNode second = head.next; // O(1)
        ListNode newHead = second; // O(1)

        while (second != null) { // O(N)
            ListNode temp = second.next; // O(1)
            second.next = first; // O(1)

            if (temp == null || temp.next == null) { // O(1)
                first.next = temp; // O(1)
                break; // O(1)
            }

            first.next = temp.next; // O(1)
            
            first = temp; // O(1)
            second = first.next; // O(1)
        }

        return newHead; // O(1)
    }
}
