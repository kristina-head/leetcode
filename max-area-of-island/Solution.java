class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    int area = dfs(r, c, grid);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }

        return maxArea;
    }

    private int dfs(int r, int c, int[][] grid) {
        boolean rInBounds = r >= 0 && r < grid.length;
        boolean cInBounds = c >= 0 && c < grid[0].length;
        if (!rInBounds || !cInBounds) return 0;

        if (grid[r][c] == 0) return 0;
        grid[r][c] = 0;

        int size = 1;

        size += dfs(r + 1, c, grid);
        size += dfs(r - 1, c, grid);
        size += dfs(r, c + 1, grid);
        size += dfs(r, c - 1, grid);

        return size;
    }
}
