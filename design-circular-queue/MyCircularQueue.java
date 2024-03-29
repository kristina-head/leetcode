class MyCircularQueue {
    int[] queue;
    int front;
    int rear;
    int size;
    
    public MyCircularQueue(int k) { // O(1)
        this.queue = new int[k];
        this.front = -1;
        this.rear = -1;
        this.size = k;
    }
    
    public boolean enQueue(int value) { // O(1)
        if (isFull()) return false;
    
        if (isEmpty()) front = 0;
        
        rear = (rear + 1) % size;
        queue[rear] = value;
        
        return true;
    }
    
    public boolean deQueue() { // O(1)
        if (isEmpty()) return false;
        
        if (front == rear) {
            front = -1;
            rear = -1;
            return true;
        }
        
        front = (front + 1) % size;
        
        return true;
    }
    
    public int Front() { // O(1)
        return isEmpty() ? -1 : queue[front];
    }
    
    public int Rear() { // O(1)
        return isEmpty() ? -1 : queue[rear];
    }
    
    public boolean isEmpty() { // O(1)
        return front == -1;
    }
    
    public boolean isFull() { // O(1)
        return ((rear + 1) % size) == front;
    }
}
