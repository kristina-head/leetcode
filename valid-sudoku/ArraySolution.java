class ArraySolution {
    public boolean isValidSudoku(char[][] board) { // O(N * N) -> O(1) as N is always 9
        int n = 9; // O(1)
        
        int[][] grids = new int[n][n]; // O(1)
        int[][] rows = new int[n][n]; // O(1)
        int[][] cols = new int[n][n]; // O(1)
        
        for (int i = 0; i < n; i++) { // O(N) -> O(1)
            for (int j = 0; j < n; j++) { // O(N) -> O(1)
                if (board[i][j] == '.') continue; // O(1)
              
                int pos = board[i][j] - '1'; // O(1)               
                int k = (i / 3) * 3 + (j / 3); // O(1)
              
                if (grids[k][pos] == 1 || rows[i][pos] == 1 || cols[j][pos] == 1) return false; // O(1)
                
                grids[k][pos] = 1; // O(1)
                rows[i][pos] = 1; // O(1)
                cols[j][pos] = 1; // O(1)
            }
        }
        
        return true; // O(1)
    }
}
