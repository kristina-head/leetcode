class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) { // O(N)
        if (head == null) return; // O(1)

        printLinkedListInReverse(head.getNext()); // O(N)
        
        head.printValue(); // O(1)
    }
}
