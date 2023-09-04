class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] charFrequency = new int[26];

        for (char c : s.toCharArray()) {
            int index = c - 'a';
            charFrequency[index]++;
        }

        for (char c : t.toCharArray()) {
            int index = c - 'a';
            if (charFrequency[index] == 0) return false;
            charFrequency[index]--;
        }

        for (int i : charFrequency) {
            if (i > 0) return false;
        }

        return true;
    }
}
