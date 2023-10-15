class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int m = grid[0].length;
        int negativeIndex = m - 1;

        for (int[] row : grid) {
            while (negativeIndex >= 0 && row[negativeIndex] < 0) {
                negativeIndex--;
            }

            count += (m - (negativeIndex + 1));
        }

        return count;
    }
}
