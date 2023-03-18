class Solution {
    public String longestCommonPrefix(String[] strs) { // O(M * N) where M is the no. of chars in strs[0] and N is the no. of Strings in strs    
        for (int i = 0; i < strs[0].length(); i++) { // O(M)
            char current = strs[0].charAt(i); // O(1)
            for (int j = 1; j < strs.length; j++) { // O(N)
                if (i == strs[j].length() || strs[j].charAt(i) != current) return strs[0].substring(0, i); // O(M)
            }
        }

        return strs[0]; // O(1)
    }
}
