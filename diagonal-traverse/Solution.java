class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[] diagonalOrder = new int[m * n];
        int index = 0;
        int row = 0;
        int col = 0;
        int direction = 1;
        
        while (row < m && col < n) {
            diagonalOrder[index++] = matrix[row][col];
            
            int newRow = row + (direction == 1 ? -1 : 1);
            int newCol = col + (direction == 1 ? 1 : -1);
            
            if (newRow < 0 || newRow == m || newCol < 0 || newCol == n) {
                if (direction == 1) {
                    row += (col == n - 1 ? 1 : 0);
                    col += (col < n - 1 ? 1 : 0);
                } else {
                    col += (row == m - 1 ? 1 : 0);
                    row += (row < m - 1 ? 1 : 0);
                }
                
                direction = 1 - direction;
            } else {
                row = newRow;
                col = newCol;
            }
        }
        
        return diagonalOrder;
    }
}
