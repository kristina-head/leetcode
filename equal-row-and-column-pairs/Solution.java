class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                boolean equal = true;

                for (int i = 0; i < n; i++) {
                    if (grid[r][i] != grid[i][c]) {
                        equal = false;
                        break;
                    }
                }

                if (equal) count++;
            }
        }

        return count;
    }
}
