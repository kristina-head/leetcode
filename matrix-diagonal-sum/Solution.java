class Solution {
    public int diagonalSum(int[][] mat) { // O(N)
        int length = mat.length; // O(1)
        int total = 0; // O(1)
        
        for (int i = 0; i < length; i++) { // O(N)
            total += mat[i][i] + mat[i][length - 1 - i]; // O(1)
        }
        
        if (length % 2 != 0) { // O(1)
            int middle = (length - 1) / 2; // O(1)
            total -= mat[middle][middle]; // O(1)
        }
        
        return total; // O(1)
    }
}
