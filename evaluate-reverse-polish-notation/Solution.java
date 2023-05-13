class Solution {
    public int evalRPN(String[] tokens) { // O(N) where N is the number of Strings in `tokens`
        Deque<Integer> stack = new ArrayDeque<>(); // O(1)
        int a, b; // O(1)
        
        for (String token : tokens) { // O(N)
            if (token.equals("+")) { // O(1)
                stack.push(stack.pop() + stack.pop()); // O(1)
            } else if (token.equals("-")) { // O(1)
                b = stack.pop(); // O(1)
                a = stack.pop(); // O(1)
                
                stack.push(a - b); // O(1)
            } else if (token.equals("*")) { // O(1)
                stack.push(stack.pop() * stack.pop()); // O(1)
            } else if (token.equals("/")) { // O(1)
                b = stack.pop(); // O(1)
                a = stack.pop(); // O(1)
                
                stack.push(a / b); // O(1)
            } else {
                stack.push(Integer.valueOf(token)); // O(1)
            }
        }
        
        return stack.pop(); // O(1)
    }
}
