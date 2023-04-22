class SolutionSimplified {
    public boolean checkIfPangram(String sentence) { // O(N) where N is sentence.length()
        if (sentence.length() < 26) return false; // O(1)
        
        for (char c = 'a'; c <= 'z'; c++) { // O(26) -> O(1)
            if (!sentence.contains(String.valueOf(c))) return false; // O(N)
        }

        return true; // O(1)
    }
}
