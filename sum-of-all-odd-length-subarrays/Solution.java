class Solution {
    public int sumOddLengthSubarrays(int[] arr) { // O(N^3)
        int total = 0; // O(1)
        int length = arr.length; // O(1)
        
        for (int i = 1; i <= length; i += 2) { // O(N)
            for (int j = 0; j <= length - i; j++) { // O(N)
                for (int k = 0; k < i; k++) { // O(N)
                    total += arr[j + k]; // O(1)
                }
            }
        }
        
        return total; 
    }
}
