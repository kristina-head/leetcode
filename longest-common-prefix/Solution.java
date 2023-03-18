class Solution {
    public String longestCommonPrefix(String[] strs) {     
        for (int i = 0; i < strs[0].length(); i++) {
            char current = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != current) return strs[0].substring(0, i);
            }
        }

        return strs[0];
    }
}
