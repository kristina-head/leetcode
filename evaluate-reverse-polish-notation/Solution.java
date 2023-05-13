class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int a, b;
        
        for (String token : tokens) {
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                b = stack.pop();
                a = stack.pop();
                
                stack.push(a - b);
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (token.equals("/")) {
                b = stack.pop();
                a = stack.pop();
                
                stack.push(a / b);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        
        return stack.pop();
    }
}
