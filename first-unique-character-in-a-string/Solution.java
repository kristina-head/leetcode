class Solution {
    public int firstUniqChar(String s) {
        int[] charCount = new int[26];
        
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            charCount[index]++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (charCount[index] == 1) return i;
        }
        
        return -1;
    }
}
