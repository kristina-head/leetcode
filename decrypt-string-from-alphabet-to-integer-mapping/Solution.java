class Solution {
    public String freqAlphabets(String s) { // O(N)
        StringBuilder sb = new StringBuilder(); // O(1)
        
        for (int i = s.length() - 1; i >= 0; i--) { // O(N)
            char c = s.charAt(i); // O(1)
            if (c == '#') { // O(1)
                int n = Integer.parseInt(s.substring(i - 2, i)); // O(1)
                sb.append((char)(n - 1 + 'a')); // O(1)
                i -= 2; // O(1)
            } else {
                sb.append((char)(c - '1' + 'a')); // O(1)
            }
        }
        
        return sb.reverse().toString(); // O(1)
    }
}
