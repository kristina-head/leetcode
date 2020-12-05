class SolutionIterative {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) { // O(B+N)
        ListNode start = list1; // O(1)
        for (int i = 0; i < a-1; i++) { // O(A)
            start = start.next; // O(1)
        }
        
        ListNode end = start; // O(1)
        for (int i = a; i <= b; i++) { // O(B-A)
            end = end.next; // O(1)
        }
        
        start.next = list2; // O(1)
        while (list2.next != null) { // O(N)
            list2 = list2.next; // O(1)
        }
        list2.next = end.next; // O(1)

        return list1; // O(1)
    }
}
