class TwoLoopsSolution {
    public boolean isAnagram(String s, String t) { 
        if (s.length() != t.length()) return false; 
        int[] charFrequency = new int[26]; 

        for (int i = 0; i < s.length(); i++) { 
            charFrequency[s.charAt(i) - 'a']++; 
            charFrequency[t.charAt(i) - 'a']--; 
        }

        for (int i : charFrequency) { 
            if (i != 0) return false; 
        }

        return true; 
    }
}
