class Solution {
    public String removeVowels(String s) {
        StringBuilder consonants = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                consonants.append(c);
            }
        }

        return consonants.toString();
    }
}
