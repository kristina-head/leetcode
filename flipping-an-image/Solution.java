class Solution {
    public int[][] flipAndInvertImage(int[][] A) { // O(N^2)
        int length = A.length;
        
        for (int i = 0; i < length; i++) { // O(N)
            for (int j = 0; j < length / 2; j++) { // O(N/2)
                int temp = A[i][j]; // O(1)
                A[i][j] = A[i][length - 1 - j]; // O(1)
                A[i][length - 1 - j] = temp; // O(1)
            }
            
            for (int j = 0; j < length; j++) { // O(N)
                A[i][j] = A[i][j] == 0 ? 1 : 0; // O(1)
            }
        }
        
        return A; // O(1)
    }
}
