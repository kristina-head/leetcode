class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) { // O(N^2)
        int size = grid.length; // O(N)
        int[] row = new int[size]; // O(N)
        int[] col = new int[size]; // O(N)
        
        for (int i = 0; i < size; i++) { // O(N^2)
            for (int j = 0; j < size; j++) { // O(N)
                row[i] = Math.max(row[i], grid[i][j]); // O(1)
                col[j] = Math.max(col[j], grid[i][j]); // O(1)
            }
        }
        
        int sum = 0; // O(1)
        
        for (int i = 0; i < size; i++) { // O(N^2)
            for (int j = 0; j < size; j++) { // O(N)
                sum += Math.min(row[i], col[j]) - grid[i][j]; // O(1)
            }
        }
        
        return sum; // O(1)
    }
}
