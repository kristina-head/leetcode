class Solution {
    public void reverseString(char[] s) { // O(N)
        int i = 0; // O(1)
        int j = s.length - 1; // O(1)
        
        while (i < j) { // O(N)
            char temp = s[i]; // O(1)
            s[i++] = s[j]; // O(1)
            s[j--] = temp; // O(1)
        }
    }
}
