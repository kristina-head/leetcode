class IterativeSolution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        Deque<ImmutableListNode> stack = new ArrayDeque<>();

        while (head != null) {
            stack.push(head);
            head = head.getNext();
        }

        while (!stack.isEmpty()) {
            stack.pop().printValue();
        }
    }
}
