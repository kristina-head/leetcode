class Solution {
    public int[] sumZero(int n) {
        int[] uniqueInts = new int[n];
        
        for (int i = 0; i < n; i++) {
            uniqueInts[i] = ((i * 2) - n) + 1;
        }
        
        return uniqueInts;
    }
}
