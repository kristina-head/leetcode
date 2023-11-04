class HashMapSolution {
    public int equalPairs(int[][] grid) { // O(N^3)
        Map<String, Integer> rows = new HashMap<>(); // O(1)
        int n = grid.length; // O(1)
        int count = 0; // O(1)

        for (int[] r : grid) { // O(N)
            String row = Arrays.toString(r); // O(N)
            rows.put(row, rows.getOrDefault(row, 0) + 1); // O(1)
        }

        for (int i = 0; i < n; i++) { // O(N)
            int[] col = new int[n]; // O(1)

            for (int j = 0; j < n; j++) { // O(N)
                col[j] = grid[j][i]; // O(1)
            }

            count += rows.getOrDefault(Arrays.toString(col), 0); // O(N)
        }

        return count; // O(1)
    }
}
