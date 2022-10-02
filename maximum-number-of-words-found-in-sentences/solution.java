class Solution {
    public int mostWordsFound(String[] sentences) { // O(N*M)
        int maxWords = 0; // O(1)
        
        for (String sentence : sentences) { // O(M)
            int words = sentence.split(" ").length; // O(N)
            if (words > maxWords) { // O(1)
                maxWords = words; // O(1)
            }
        }
        
        return maxWords; // O(1)
    }
}
