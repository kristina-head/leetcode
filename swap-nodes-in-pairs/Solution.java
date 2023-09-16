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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode first = head;
        ListNode second = head.next;
        ListNode newHead = second;

        while (second != null) {
            ListNode temp = second.next;
            second.next = first;

            if (temp == null || temp.next == null) {
                first.next = temp;
                break;
            }

            first.next = temp.next;
            
            first = temp;
            second = first.next;
        }

        return newHead;
    }
}
