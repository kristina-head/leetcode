class Solution {
    public boolean checkIfPangram(String sentence) { // O(N)
        if (sentence.length() < 26) return false; // O(1)

        boolean[] isPresent = new boolean[26]; // O(1)

        for (int i = 0; i < sentence.length(); i++) { // O(N)
            int letter = sentence.charAt(i) - 97; // O(1)
            isPresent[letter] = true; // O(1)
        }

        for (int i = 0; i < isPresent.length; i++) { // O(26) -> O(1)
            if (!isPresent[i]) return false; // O(1)
        }

        return true; // O(1)
    }
}
