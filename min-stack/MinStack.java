class MinStack {
    List<Integer> stack;
    List<Integer> minStack;

    public MinStack() { // O(1)
        this.stack = new ArrayList<>();
        this.minStack = new ArrayList<>();
    }
    
    public void push(int val) { // O(1)      
        if (stack.isEmpty() || val <= minStack.get(minStack.size() - 1)) minStack.add(val);
        
        stack.add(val);
    }
    
    public void pop() { // O(1)
        int element = stack.get(stack.size() - 1);
        int min = minStack.get(minStack.size() - 1);
        
        if (element == min) minStack.remove(minStack.size() - 1);
        
        stack.remove(stack.size() - 1);
    }
    
    public int top() { // O(1)
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() { // O(1)
        return minStack.get(minStack.size() - 1);
    }
}
