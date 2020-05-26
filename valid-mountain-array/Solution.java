class Solution {
    public boolean validMountainArray(int[] A) { // O(N)
        boolean increase = false; // O(1)
        boolean decrease = false; // O(1)
        
        for (int i = 0; i < A.length - 1; i++) { // O(N)
            if (!decrease && A[i] < A[i+1]) { // O(1)
                increase = true; // O(1)
            } else if (increase && A[i] > A[i+1]) { // O(1)
                decrease = true; // O(1)
            } else {
                return false; // O(1)
            }
        }
        
        return increase && decrease; // O(1)
    }
}
