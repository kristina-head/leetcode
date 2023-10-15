class Solution {
    public int countNegatives(int[][] grid) { // O(N * M)
        int count = 0; // O(1)
        int m = grid[0].length; // O(1)
        int negativeIndex = m - 1; // O(1)

        for (int[] row : grid) { // O(N)
            while (negativeIndex >= 0 && row[negativeIndex] < 0) { // O(M)
                negativeIndex--; // O(1)
            }

            count += (m - (negativeIndex + 1)); // O(1)
        }

        return count; // O(1)
    }
}
