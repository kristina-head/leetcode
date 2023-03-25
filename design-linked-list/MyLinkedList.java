class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() { // O(1)
        this.head = null;
        this.size = 0;
    }
    
    public int get(int index) { // O(N) where N is the no. of nodes in the List
        if (index >= size) return -1;
        
        Node node = head;
        int count = 0;
        
        while (count < index) {
            node = node.next;
            count++;
        }
        
        return node.val;
    }
    
    public void addAtHead(int val) { // O(1)
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }
    
    public void addAtTail(int val) { // O(N) where N is the no. of nodes in the List
        if (head == null) {
            addAtHead(val);
        } else {
            Node node = head;

            while (node.next != null) {
                node = node.next;
            }

            Node newNode = new Node(val);
            node.next = newNode;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) { // O(N) where N is the no. of nodes in the List
        if (index > size) return;
        
        if (index == 0) {
            addAtHead(val);
        } else {
            Node node = head;
            int count = 1;

            while (count < index) {
                node = node.next;
                count++;
            }

            Node newNode = new Node(val);
            Node temp = node.next;
            node.next = newNode;
            newNode.next = temp;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) { // O(N) where N is the no. of nodes in the List
        if (index >= size) return;
        
        if (index == 0) {
            head = head.next;
            size--;
        } else {
            Node node = head;
            int count = 1;

            while (count < index) {
                node = node.next;
                count++;
            }

            node.next = node.next.next;
            size--;
        }
    }
    
    public class Node {
        int val;
        Node next;

        public Node(int val) { // O(1)
            this.val = val;
        }
    }
}
