class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A.length - 1 - j];
                A[i][A.length - 1 - j] = temp;
            }
            
            for (int j = 0; j < A.length; j++) {
                A[i][j] = A[i][j] == 0 ? 1 : 0;
            }
        }
        
        return A;
    }
}
