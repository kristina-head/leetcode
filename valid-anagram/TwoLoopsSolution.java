class TwoLoopsSolution {
    public boolean isAnagram(String s, String t) { // O(N) where N is the length of the input Strings
        if (s.length() != t.length()) return false; // O(1)
        int[] charFrequency = new int[26]; // O(1)

        for (int i = 0; i < s.length(); i++) { // O(N)
            charFrequency[s.charAt(i) - 'a']++; // O(1)
            charFrequency[t.charAt(i) - 'a']--; // O(1)
        }

        for (int i : charFrequency) { // O(26) -> O(1)
            if (i != 0) return false; // O(1)
        }

        return true; // O(1)
    }
}
