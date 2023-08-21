class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        int maxVowels = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) maxVowels++;
        }

        int count = maxVowels;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k))) count--;
            if (vowels.contains(s.charAt(i))) count++;

            maxVowels = Math.max(count, maxVowels);
        }

        return maxVowels;
    }
}
