class Solution {
    public int maximumWealth(int[][] accounts) { // O(N*M)
        int wealth; // O(1)
        int maxWealth = 0; // O(1)
        
        for (int i = 0; i < accounts.length; i++) { // O(M)
            wealth = 0; // O(1)
            for (int j = 0; j < accounts[i].length; j++) { // O(N)
                wealth += accounts[i][j]; // O(1)
            }
            maxWealth = Math.max(maxWealth, wealth); // O(1)
        }
        
        return maxWealth; // O(1)
    }
}
