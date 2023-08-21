class Solution {
    public int maxVowels(String s, int k) { // O(K + N) where N is the length of s
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u'); // O(1)

        int maxVowels = 0; // O(1)
        for (int i = 0; i < k; i++) { // O(K)
            if (vowels.contains(s.charAt(i))) maxVowels++; // O(1)
        }

        int count = maxVowels; // O(1)
        for (int i = k; i < s.length(); i++) { // O(N)
            if (vowels.contains(s.charAt(i - k))) count--; // O(1)
            if (vowels.contains(s.charAt(i))) count++; // O(1)

            maxVowels = Math.max(count, maxVowels); // O(1)
        }

        return maxVowels; // O(1)
    }
}
