/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) { // O(N)    
        ListNode currentNode = head; // O(1)
        List<Integer> binaryValues = new ArrayList<>(); // O(1)
        
        while (currentNode != null) { // O(N) 
            binaryValues.add(currentNode.val); // O(1)
            currentNode = currentNode.next; // O(1)
        }
        
        int decimalValue = 0; // O(1)
        int exponent = 0; // O(1)
        
        for (int i = binaryValues.size() - 1; i >= 0; i--) { // O(N)
            if (binaryValues.get(i) == 1) { // O(1)
                decimalValue += (int) Math.pow(2, exponent); // O(1)
            }
            exponent++; // O(1)
        }
        
        return decimalValue; // O(1)
    }
}
