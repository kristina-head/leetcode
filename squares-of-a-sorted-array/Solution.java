class Solution {
    public int[] sortedSquares(int[] A) { // O(N log N)
        for (int i = 0; i < A.length; i++) { // O(N)
            A[i] = A[i] * A[i]; // O(1)
        }
        
        Arrays.sort(A); // O(N log N)
               
        return A; // O(1)
    }
}
