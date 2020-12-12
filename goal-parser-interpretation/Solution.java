class Solution {
    public String interpret(String command) { // O(N)
        StringBuilder sb = new StringBuilder(); // O(1)
        
        for (int i = 0; i < command.length(); i++) { // O(N)
            if (command.charAt(i) == 'G') { // O(1)
                sb.append('G'); // O(1)
            } else if (command.charAt(i) == '(') { // O(1)
                if (command.charAt(i+1) == ')') { // O(1)
                    sb.append('o'); // O(1)
                } else {
                    sb.append("al"); // O(1)
                }
            }
        }
        
        return sb.toString(); // O(M)
    }
}
