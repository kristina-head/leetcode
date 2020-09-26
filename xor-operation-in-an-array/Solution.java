class Solution {
    public int xorOperation(int n, int start) { // O(N)
        int xor = 0; // O(1)
        for (int i = 0; i < n; i++) { // O(N)
            xor ^= start + 2 * i; // O(1)
        }
        return xor; // O(1)
    }
}
