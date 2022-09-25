class Solution {
    public int finalValueAfterOperations(String[] operations) { // O(N)
        int x = 0; // O(1)
        
        for (String operation : operations) { // O(N)
            if (operation.charAt(1) == '+') { // O(1)
                x++; // O(1)
            } else {
                x--; // O(1)
            }
        }
        
        return x; // O(1)
    }
}
