class Solution {
    private static final int[][] directions = new int[][] {
        {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}
    }; // O(1)

    public int shortestPathBinaryMatrix(int[][] grid) { // O(N^2)
        int n = grid.length; // O(1)

        if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0) { // O(1)
            return -1; // O(1)
        }

        Deque<int[]> queue = new ArrayDeque<>(); // O(1)
        grid[0][0] = 1; // O(1)
        queue.addLast(new int[] {0, 0}); // O(1)

        while (!queue.isEmpty()) { // O(N^2)
            int[] cell = queue.removeFirst(); // O(1)
            int row = cell[0]; // O(1)
            int col = cell[1]; // O(1)
            int distance = grid[row][col]; // O(1)

            if (row == n - 1 && col == n - 1) { // O(1)
                return distance; // O(1)
            }

            for (int[] neighbor : getNeighbors(grid, row, col)) { // O(8) -> O(1)
                int neighborRow = neighbor[0]; // O(1)
                int neighborCol = neighbor[1]; // O(1)
                
                queue.addLast(new int[] {neighborRow, neighborCol}); // O(1)
                grid[neighborRow][neighborCol] = distance + 1; // O(1)
            }
        }

        return -1; // O(1)
    }

    private List<int[]> getNeighbors(int[][] grid, int row, int col) { // O(1)
        List<int[]> neighbors = new ArrayList<>(); // O(1)

        for (int[] direction : directions) { // O(8) -> O(1)
            int neighborRow = row + direction[0]; // O(1)
            int neighborCol = col + direction[1]; // O(1)
            boolean neighborRowInBounds = neighborRow >= 0 && neighborRow < grid.length; // O(1)
            boolean neighborColInBounds = neighborCol >= 0 && neighborCol < grid.length; // O(1)

            if (neighborRowInBounds && neighborColInBounds && grid[neighborRow][neighborCol] == 0) { // O(1)
                neighbors.add(new int[] {neighborRow, neighborCol}); // O(1)
            }
        }

        return neighbors; // O(1)
    }
}
