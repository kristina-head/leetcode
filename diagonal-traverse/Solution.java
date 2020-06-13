class Solution {
    public int[] findDiagonalOrder(int[][] matrix) { // O(M * N)
        if (matrix == null || matrix.length == 0) { // O(1)
            return new int[0]; // O(1)
        }
        
        int m = matrix.length; // O(1)
        int n = matrix[0].length; // O(1)
        int[] diagonalOrder = new int[m * n]; // O(M * N)
        int index = 0; // O(1)
        int row = 0; // O(1)
        int col = 0; // O(1)
        int direction = 1; // O(1)
        
        while (row < m && col < n) { // O(M * N)
            diagonalOrder[index++] = matrix[row][col]; // O(1)
            
            int newRow = row + (direction == 1 ? -1 : 1); // O(1)
            int newCol = col + (direction == 1 ? 1 : -1); // O(1)
            
            if (newRow < 0 || newRow == m || newCol < 0 || newCol == n) { // O(1)
                if (direction == 1) { // O(1)
                    row += (col == n - 1 ? 1 : 0); // O(1)
                    col += (col < n - 1 ? 1 : 0); // O(1)
                } else {
                    col += (row == m - 1 ? 1 : 0); // O(1)
                    row += (row < m - 1 ? 1 : 0); // O(1)
                }
                
                direction = 1 - direction; // O(1)
            } else {
                row = newRow; // O(1)
                col = newCol; // O(1)
            }
        }
        
        return diagonalOrder; // O(1)
    }
}
