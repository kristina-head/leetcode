class Solution {
    public int[][] largestLocal(int[][] grid) { // O(N * N)
        int n = grid.length; // O(1)
        int[][] maxLocal = new int[n - 2][n - 2]; // O(1)

        for (int i = 0; i < n - 2; i++) { // O(N)
            for (int j = 0; j < n - 2; j++) { // O(N)
                for (int k = i; k < i + 3; k++) { // O(3)
                    for (int l = j; l < j + 3; l++) { // O(3)
                        maxLocal[i][j] = Math.max(maxLocal[i][j], grid[k][l]); // O(1)
                    }
                }
            }
        }

        return maxLocal; // O(1)
    }
}
