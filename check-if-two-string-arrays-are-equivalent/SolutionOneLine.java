class SolutionOneLine { 
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) { // O(N)
        return String.join("", word1).equals(String.join("", word2)); // O(N)
    }
}
