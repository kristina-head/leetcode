class Solution {
    public String removeOuterParentheses(String S) { // O(N)
        int bracket = 0; // O(1)
        StringBuilder innerParentheses = new StringBuilder(); // O(1)
        
        for (char c : S.toCharArray()) { // O(N)
            if (c == '(') { // O(1)
                bracket++; // O(1)
                if (bracket > 1) { // O(1)
                    innerParentheses.append(c); // O(1)
                }
            } else {
                bracket--; // O(1)
                if (bracket > 0) { // O(1)
                    innerParentheses.append(c); // O(1)
                }
            }
        }
        
        return innerParentheses.toString(); // O(N)
    }
}
