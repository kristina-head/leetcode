class Solution {
    public int diagonalSum(int[][] mat) {
        int length = mat.length;
        int total = 0;
        
        for (int i = 0; i < length; i++) {
            total += mat[i][i] + mat[i][length - 1 - i];
        }
        
        if (length % 2 != 0) {
            int middle = (length - 1) / 2;
            total -= mat[middle][middle];
        }
        
        return total;
    }
}
