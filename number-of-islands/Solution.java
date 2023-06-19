class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    count++;
                    dfs(r, c, grid);
                }
            }
        }

        return count;
    }

    private void dfs(int r, int c, char[][] grid) {
        boolean rInBounds = r >= 0 && r < grid.length;
        boolean cInBounds = c >= 0 && c < grid[0].length;
        if (!rInBounds || !cInBounds) return;

        if (grid[r][c] == '0') return;
        grid[r][c] = '0';

        dfs(r + 1, c, grid);
        dfs(r - 1, c, grid);
        dfs(r, c + 1, grid);
        dfs(r, c - 1, grid);
    }
}
