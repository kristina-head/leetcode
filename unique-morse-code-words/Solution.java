class Solution {
    public int uniqueMorseRepresentations(String[] words) { // O(N)
        String[] morse = new String[] {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."}; // O(1)
        Set<String> uniqueMorseWords = new HashSet<>(); // O(1)
        
        for (String word : words) { // O(M)
            StringBuilder code = new StringBuilder(); // O(1)
            for (char letter : word.toCharArray()) { // O(N)
                code.append(morse[letter - 'a']); // O(1)
            }
            uniqueMorseWords.add(code.toString()); // O(1)
        }
        
        return uniqueMorseWords.size(); // O(1)
    }
}
