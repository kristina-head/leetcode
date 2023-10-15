class BinarySearchSolution {
    public int countNegatives(int[][] grid) { // O(N log N)
        int negatives = 0; // O(1)
        
        for (int i = 0; i < grid.length; i++) { // O(N)
            int start = 0; // O(1)
            int end = grid[i].length - 1; // O(1)
            
            while (start <= end) { // O(log N)
                int mid = start + (end - start) / 2; // O(1)
                if (grid[i][mid] < 0) { // O(1)
                    end = mid - 1; // O(1)
                } else {
                    start = mid + 1; // O(1)
                }
            }
            
            negatives += (grid[i].length - start); // O(1)
            end = start; // O(1)
        }
        
        return negatives; // O(1)
    }   
}
