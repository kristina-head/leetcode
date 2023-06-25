class Solution {
    public int maxAreaOfIsland(int[][] grid) { // O(M * N) where M is the number of rows and N is the number of columns in the grid
        int maxArea = 0; // O(1)

        for (int r = 0; r < grid.length; r++) { // O(M)
            for (int c = 0; c < grid[0].length; c++) {  // O(N)
                if (grid[r][c] == 1) { // O(1)
                    int area = dfs(r, c, grid); // O(1)
                    maxArea = Math.max(area, maxArea); // O(1)
                }
            }
        }

        return maxArea; // O(1)
    }

    private int dfs(int r, int c, int[][] grid) { // O(1)
        boolean rInBounds = r >= 0 && r < grid.length; // O(1)
        boolean cInBounds = c >= 0 && c < grid[0].length; // O(1)
        if (!rInBounds || !cInBounds) return 0; // O(1)

        if (grid[r][c] == 0) return 0; // O(1)
        grid[r][c] = 0; // O(1)

        int size = 1; // O(1)

        size += dfs(r + 1, c, grid); // O(1)
        size += dfs(r - 1, c, grid); // O(1)
        size += dfs(r, c + 1, grid); // O(1)
        size += dfs(r, c - 1, grid); // O(1)

        return size; // O(1)
    }
}
