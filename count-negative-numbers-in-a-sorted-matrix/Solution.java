class Solution {
    public int countNegatives(int[][] grid) {
        int negatives = 0;
        
        for (int i = 0; i < grid.length; i++) {
            int start = 0;
            int end = grid[i].length - 1;
            
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (grid[i][mid] < 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            
            negatives += (grid[i].length - start);
            end = start;
        }
        
        return negatives;
    }   
}
