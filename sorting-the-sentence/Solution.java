class Solution {
    public String sortSentence(String s) { // O(N + M) where N is s.length() and M is words.length()
        String[] words = s.split(" "); // O(N)
        String[] result = new String[words.length]; // O(1)

        for (String w : words) { // O(M)
            int lastCharIndex = w.length() - 1; // O(1)
            int pos = Character.getNumericValue(w.charAt(lastCharIndex)) - 1; // O(1)
            result[pos] = w.substring(0, lastCharIndex); // O(1)
        }

        return String.join(" ", result); // O(M)
    }
}
