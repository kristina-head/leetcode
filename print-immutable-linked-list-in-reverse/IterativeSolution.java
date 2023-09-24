class IterativeSolution {
    public void printLinkedListInReverse(ImmutableListNode head) { // O(N)
        Deque<ImmutableListNode> stack = new ArrayDeque<>(); // O(1)

        while (head != null) { // O(N)
            stack.push(head); // O(1)
            head = head.getNext(); // O(1)
        }

        while (!stack.isEmpty()) { // O(N)
            stack.pop().printValue(); // O(1)
        }
    }
}
