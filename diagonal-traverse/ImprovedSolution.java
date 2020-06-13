class ImprovedSolution {
    public int[] findDiagonalOrder(int[][] matrix) { // O(M * N)
        if (matrix == null || matrix.length == 0) { // O(1)
            return new int[0]; // O(1)
        }
        
        int m = matrix.length; // O(1)
        int n = matrix[0].length; // O(1)
        int[] diagonalOrder = new int[m * n]; // O(M * N)
        int row = 0; // O(1)
        int col = 0; // O(1)
        
        for (int i = 0; i < m * n; i++) { // O(M * N)
            diagonalOrder[i] = matrix[row][col]; // O(1)
            
            if ((row + col) % 2 == 0) { // O(1)
                if (col == n - 1) { // O(1) 
                    row++; // O(1)
                } else if (row == 0) { // O(1)
                    col++; // O(1)
                } else { 
                    row--; // O(1)
                    col++; // O(1)
                }
            } else {
                if (row == m - 1) { // O(1)
                    col++; // O(1)
                } else if (col == 0) { // O(1)
                    row++; // O(1)
                } else { 
                    row++; // O(1)
                    col--; // O(1)
                }
            }   
        }
        
        return diagonalOrder; // O(1)
    }
}
   
        
