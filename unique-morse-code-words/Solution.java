class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[] {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> uniqueMorseWords = new HashSet<>();
        
        for (String word : words) {
            StringBuilder code = new StringBuilder();
            for (char letter : word.toCharArray()) {
                code.append(morse[letter - 'a']);
            }
            uniqueMorseWords.add(code.toString());
        }
        
        return uniqueMorseWords.size();
    }
}
