class Solution {
    public int[] sortArrayByParity(int[] A) { // O(N)
        int i = 0; // O(1)
        int j = A.length - 1; // O(1)
        
        while (i < j) { // O(N)
            if (A[i] % 2 > A[j] % 2) { // O(1)
                int temp = A[i]; // O(1)
                A[i] = A[j]; // O(1)
                A[j] = temp; // O(1)
            }

            if (A[i] % 2 == 0) { // O(1)
                i++; // O(1)
            }
            
            if (A[j] % 2 == 1) { // O(1)
                j--; // O(1)
            }
        }

        return A; // O(1)
    }
}
