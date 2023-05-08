class Solution {
    public boolean isValid(String s) { // O(N) where N is the number of chars in s
        if (s.length() % 2 != 0) return false; // O(1)
            
        Deque<Character> stack = new ArrayDeque<>(); // O(1)
        
        for (char c : s.toCharArray()) { // O(N)
            if (c == '(' || c == '{' || c == '[') { // O(1)
                stack.push(c); // O(1)
            } else {
                if (stack.isEmpty()) return false; // O(1)
                
                char top = stack.pop(); // O(1)
                
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) { // O(1)
                    return false; // O(1)
                }
            }
        }
        
        return stack.isEmpty(); // O(1)
    }
}
