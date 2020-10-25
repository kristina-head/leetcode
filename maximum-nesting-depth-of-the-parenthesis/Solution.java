class Solution {
    public int maxDepth(String s) { // O(N)
        int depth = 0; // O(1)
        int maxDepth = 0; // O(1)
        
        for (int i = 0; i < s.length(); i++) { // O(N)
            if (s.charAt(i) == '(') { // O(1)
                depth++; // O(1)
            } else if (s.charAt(i) == ')') { // O(1)
                if (depth > maxDepth) { // O(1)
                    maxDepth = depth; // O(1)
                }
                depth--; // O(1)
            }
        }
        
        return maxDepth; // O(1)
    }
}
