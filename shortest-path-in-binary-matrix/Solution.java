class Solution {
    private static final int[][] directions = new int[][]{
        {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}
    };

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0) {
            return -1;
        }

        Deque<int[]> queue = new ArrayDeque<>();
        grid[0][0] = 1;
        queue.addLast(new int[] {0, 0});

        while (!queue.isEmpty()) {
            int[] cell = queue.removeFirst();
            int row = cell[0];
            int col = cell[1];
            int distance = grid[row][col];

            if (row == n - 1 && col == n - 1) {
                    return distance;
                }

            for (int[] neighbor : getNeighbors(grid, row, col)) {
                int neighborRow = neighbor[0];
                int neighborCol = neighbor[1];
                
                queue.addLast(new int[] {neighborRow, neighborCol});
                grid[neighborRow][neighborCol] = distance + 1;
            }
        }

        return -1;
    }

    private List<int[]> getNeighbors(int[][] grid, int row, int col) {
        List<int[]> neighbors = new ArrayList<>();

        for (int[] direction : directions) {
            int neighborRow = row + direction[0];
            int neighborCol = col + direction[1];
            boolean neighborRowInBounds = neighborRow >= 0 && neighborRow < grid.length;
            boolean neighborColInBounds = neighborCol >= 0 && neighborCol < grid.length;

            if (neighborRowInBounds && neighborColInBounds && grid[neighborRow][neighborCol] == 0) {
                neighbors.add(new int[] {neighborRow, neighborCol});
            }
        }

        return neighbors;
    }
}
