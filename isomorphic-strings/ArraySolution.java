class ArraySolution {
    public boolean isIsomorphic(String s, String t) { // O(N) where N is the length of s and t
        int[] mapS = new int[128]; // O(1)
        int[] mapT = new int[128]; // O(1)
        
        for (int i = 0; i < s.length(); i++) { // O(N)
            if (mapS[s.charAt(i)] != mapT[t.charAt(i)]) return false; // O(1)
            
            mapS[s.charAt(i)] = i + 1; // O(1)
            mapT[t.charAt(i)] = i + 1; // O(1)
        }
        
        return true; // O(1)
    }
}
