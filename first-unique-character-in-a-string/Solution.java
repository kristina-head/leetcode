class Solution {
    public int firstUniqChar(String s) { // O(N) where N is the length of String s
        int[] charCount = new int[26]; // O(1)
        
        for (char c : s.toCharArray()) { // O(N)
            int index = c - 'a'; // O(1)
            charCount[index]++; // O(1)
        }
        
        for (int i = 0; i < s.length(); i++) { // O(N)
            int index = s.charAt(i) - 'a'; // O(1)
            if (charCount[index] == 1) return i; // O(1)
        }
        
        return -1; // O(1)
    }
}
