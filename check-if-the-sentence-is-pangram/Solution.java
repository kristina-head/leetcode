class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;

        boolean[] isPresent = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            int letter = sentence.charAt(i) - 97;
            isPresent[letter] = true;
        }

        for (int i = 0; i < isPresent.length; i++) {
            if (!isPresent[i]) return false;
        }

        return true;
    }
}
