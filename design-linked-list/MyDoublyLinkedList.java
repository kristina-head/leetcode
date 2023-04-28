class MyDoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public MyLinkedList() { // O(1)
        this.head = new Node(0);
        this.tail = new Node(0);
        this.head.next = tail;
        this.tail.next = head;
        this.size = 0;
    }
    
    public int get(int index) { // O(N) where N is the length of the LinkedList
        if (index < 0 || index >= size) return -1;
        
        Node node = head;
        
        for (int i = 0; i <= index; i++) {
            node = node.next;
        }
        
        return node.val;
    }
    
    public void addAtHead(int val) { // O(1)
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) { // O(N) where N is the length of the LinkedList
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) { // O(N) where N is the length of the LinkedList
        if (index < 0 || index > size) return;

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        Node newNode = new Node(val);
        newNode.next = node.next;
        newNode.next.prev = newNode;
        node.next = newNode;
        newNode.prev = node;
        size++;
    }
    
    public void deleteAtIndex(int index) { // O(N) where N is the length of the LinkedList
        if (index < 0 || index >= size) return;
        
        Node node = head;

        for (int i = 0; i <= index; i++) {
            node = node.next;
        }

        node.next.prev = node.prev;
        node.prev.next = node.next;
        size--;
    }
    
    public class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) { // O(1)
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
}
