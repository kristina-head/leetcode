class Solution {
    public int oddCells(int n, int m, int[][] indices) { // O(N*M)
        int[][] matrix = new int[n][m]; // O(N*M)
        int oddNumbers = 0; // O(1)
        
        for (int i = 0; i < indices.length; i++) { // O(M+N)
            int row = indices[i][0]; // O(1)
            int col = indices[i][1]; // O(1)
            
            for (int j = 0; j < m; j++) { // O(M)
                matrix[row][j]++; // O(1)
            }
            
            for (int j = 0; j < n; j++) { // O(N)
                matrix[j][col]++; // O(1)
            }
        }
        
        for (int i = 0; i < n; i++) { // O(N*M)
            for (int j = 0; j < m; j++) { // O(M)
                if (matrix[i][j] % 2 != 0) { // O(1)
                    oddNumbers++; // O(1)
                }
            }
        }
        
        return oddNumbers; // O(1)
    }
}
