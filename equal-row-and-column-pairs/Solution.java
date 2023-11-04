class Solution {
    public int equalPairs(int[][] grid) { // O(N^3)
        int n = grid.length; // O(1)
        int count = 0; // O(1)

        for (int r = 0; r < n; r++) { // O(N)
            for (int c = 0; c < n; c++) { // O(N)
                boolean equal = true; // O(1)

                for (int i = 0; i < n; i++) { // O(N)
                    if (grid[r][i] != grid[i][c]) { // O(1)
                        equal = false; // O(1)
                        break; // O(1)
                    }
                }

                if (equal) count++; // O(1)
            }
        }

        return count; // O(1)
    }
}
