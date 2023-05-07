class MinStack {
    List<Integer> stack;
    List<Integer> minStack;

    public MinStack() {
        this.stack = new ArrayList<>();
        this.minStack = new ArrayList<>();
    }
    
    public void push(int val) {      
        if (stack.isEmpty() || val <= minStack.get(minStack.size() - 1)) minStack.add(val);
        
        stack.add(val);
    }
    
    public void pop() {
        int element = stack.get(stack.size() - 1);
        int min = minStack.get(minStack.size() - 1);
        
        if (element == min) minStack.remove(minStack.size() - 1);
        
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}
