class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {  
        ListNode end = getPosition(list1, 0, b+1);
        getPosition(list1, 0, a-1).next = list2;
        getLast(list2).next = end;
        
        return list1;
    }
    
    private ListNode getPosition(ListNode listNode, int current, int position) {
        if (current == position)
            return listNode; 
        
        return getPosition(listNode.next, current+1, position);
    }
    
    private ListNode getLast(ListNode listNode) {
        if (listNode.next == null)
            return listNode;
        
        return getLast(listNode.next);
    }
}
