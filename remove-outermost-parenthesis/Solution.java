class Solution {
    public String removeOuterParentheses(String S) {
        int bracket = 0;
        StringBuilder innerParentheses = new StringBuilder();
        
        for (char c : S.toCharArray()) {
            if (c == '(') {
                bracket++;
                if (bracket > 1) {
                    innerParentheses.append(c);
                }
            } else {
                bracket--;
                if (bracket > 0) {
                    innerParentheses.append(c);
                }
            }
        }
        
        return innerParentheses.toString();
    }
}
