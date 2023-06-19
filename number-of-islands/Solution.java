class Solution {
    public int numIslands(char[][] grid) { // O(N * M) where N is the number of rows and M is the number of columns in the grid
        int count = 0; // O(1)

        for (int r = 0; r < grid.length; r++) { // O(N)
            for (int c = 0; c < grid[0].length; c++) { // O(M)
                if (grid[r][c] == '1') { // O(1)
                    count++; // O(1)
                    dfs(r, c, grid); // O(1)
                }
            }
        }

        return count; // O(1)
    }

    private void dfs(int r, int c, char[][] grid) { // O(1)
        boolean rInBounds = r >= 0 && r < grid.length; // O(1)
        boolean cInBounds = c >= 0 && c < grid[0].length; // O(1)
        if (!rInBounds || !cInBounds) return; // O(1)

        if (grid[r][c] == '0') return; // O(1)
        grid[r][c] = '0'; // O(1)

        dfs(r + 1, c, grid); // O(1)
        dfs(r - 1, c, grid); // O(1)
        dfs(r, c + 1, grid); // O(1)
        dfs(r, c - 1, grid); // O(1)
    }
}
