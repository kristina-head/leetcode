class Solution {
    public int smallestEvenMultiple(int n) { // O(1)
        int multiple = n * 2; // O(1)
        
        return (n % 2 == 0) ? multiple / 2 : multiple; // O(1)
    }
}
