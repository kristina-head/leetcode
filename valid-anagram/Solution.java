class Solution {
    public boolean isAnagram(String s, String t) { // O(N) where N is the length of both input Strings
        if (s.length() != t.length()) return false; // O(1)
        int[] charFrequency = new int[26]; // O(1)

        for (char c : s.toCharArray()) { // O(N)
            int index = c - 'a'; // O(1)
            charFrequency[index]++; // O(1)
        }

        for (char c : t.toCharArray()) { // O(N)
            int index = c - 'a'; // O(1)
            if (charFrequency[index] == 0) return false; // O(1)
            charFrequency[index]--; // O(1)
        }

        for (int i : charFrequency) { // O(26) -> O(1)
            if (i > 0) return false; // O(1)
        }

        return true; // O(1)
    }
}
