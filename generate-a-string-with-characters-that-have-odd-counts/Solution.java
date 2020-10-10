class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder(n);
        
        for (int i = 0; i < n - 1; i++) {
            sb.append('k');
        }
        
        if (n % 2 != 0) {
            sb.append('k');
        } else {
            sb.append('h');
        }
        
        return sb.toString();
    }
}
