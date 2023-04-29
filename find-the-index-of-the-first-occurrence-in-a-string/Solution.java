class Solution {
    public int strStr(String haystack, String needle) { // O((N - M) * M) -> O(N * M) where N is haystack.length() and M is needle.length()
        if (needle.length() > haystack.length()) return -1; // O(1)
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) { // O(N - M) 
            if (haystack.substring(i, i + needle.length()).equals(needle)) return i; // O(M)
        }
        
        return -1; // O(1)
    }
}
