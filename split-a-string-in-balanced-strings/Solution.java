class Solution {
    public int balancedStringSplit(String s) { // O(N)
        int count = 0; // O(1)
        int balance = 0; // O(1)
        
        for (int i = 0; i < s.length(); i++) { // O(N)
            if (s.charAt(i) == 'L') { // O(1)
                balance++; // O(1)
            } else { 
                balance--; // O(1)
            }
            
            if (balance == 0) { // O(1)
                count++; // O(1)
            }
        }
        
        return count; // O(1)
    }
}
