class Solution {
    public int[] sumZero(int n) { // O(N)
        int[] uniqueInts = new int[n]; // O(N)
        
        for (int i = 0; i < n; i++) { // O(N)
            uniqueInts[i] = ((i * 2) - n) + 1; // O(1)
        }
        
        return uniqueInts; // O(1)
    }
}
