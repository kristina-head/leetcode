class Solution {
    public String generateTheString(int n) { // O(N)
        StringBuilder sb = new StringBuilder(n); // O(N)
        
        for (int i = 0; i < n - 1; i++) { // O(N-1)
            sb.append('k'); // O(1)
        }
        
        if (n % 2 != 0) { // O(1)
            sb.append('k'); // O(1)
        } else {
            sb.append('h'); // O(1)
        }
        
        return sb.toString(); // O(N)
    }
}
