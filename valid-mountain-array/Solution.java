class Solution {
    public boolean validMountainArray(int[] A) {
        boolean increase = false;
        boolean decrease = false;
        
        for (int i = 0; i < A.length - 1; i++) {
            if (!decrease && A[i] < A[i+1]) {
                increase = true;
            } else if (increase && A[i] > A[i+1]) {
                decrease = true;
            } else {
                return false;
            }
        }
        
        return increase && decrease;
    }
}
