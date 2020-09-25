class Solution {
    public String restoreString(String s, int[] indices) { // O(N)
        int length = indices.length; // O(1)
        char[] t = new char[length]; // O(N)
        
        for (int i = 0; i < length; i++) { // O(N)
            t[indices[i]] = s.charAt(i); // O(1)
        }
        
        return new String(t); // O(N)
    }
}
