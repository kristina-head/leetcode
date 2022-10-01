class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            int words = sentence.split(" ").length;
            if (words > maxWords) {
                maxWords = words;
            }
        }
        
        return maxWords;
    }
}
