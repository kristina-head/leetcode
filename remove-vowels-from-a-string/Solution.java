class Solution {
    public String removeVowels(String s) { // O(N)
        StringBuilder consonants = new StringBuilder(); // O(1)

        for (char c : s.toCharArray()) { // O(N)
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') { // O(1)
                consonants.append(c); // O(1)
            }
        }

        return consonants.toString(); // O(N)
    }
}
