class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String w : words) {
            int lastCharIndex = w.length() - 1;
            int pos = Character.getNumericValue(w.charAt(lastCharIndex)) - 1;
            result[pos] = w.substring(0, lastCharIndex);
        }

        return String.join(" ", result);
    }
}
