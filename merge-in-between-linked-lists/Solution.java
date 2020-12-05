class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) { // O(N)
        ListNode end = getPosition(list1, 0, b+1); // O(N)
        getPosition(list1, 0, a-1).next = list2; // O(N)
        getLast(list2).next = end; // O(N)
        
        return list1; // O(1)
    }
    
    private ListNode getPosition(ListNode listNode, int current, int position) { // O(N)
        if (current == position) // O(1)
            return listNode; // O(1)
        
        return getPosition(listNode.next, current+1, position); // O(N)
    }
    
    private ListNode getLast(ListNode listNode) { // O(N)
        if (listNode.next == null) // O(1)
            return listNode; // O(1)
        
        return getLast(listNode.next); // O(N)
    }
}
