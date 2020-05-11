class HashmapSolution {
    public String freqAlphabets(String s) { // O(N)
        Map<String, Character> map = new HashMap<>(); // O(1)
        int key = 1; // O(1)
        
        for (char ch = 'a'; ch <= 'z'; ch++) { // O(1)
            if (key < 10) { // O(1)
                map.put(String.valueOf(key++), ch); // O(1)
            } else {
                map.put(String.valueOf(key++)+"#", ch); // O(1)
            }
        }
        
        StringBuilder sb = new StringBuilder(); // O(1)
        
        for (int i = s.length()-1; i >= 0; i--) { // O(N)
            if (s.charAt(i) == '#') { // O(1)
                sb.append(map.get(s.substring(i-2, i+1))); // O(1)
                i -= 2; // O(1)
            } else {
                sb.append(map.get(s.substring(i, i+1))); // O(1)
            }
        }
        
        return sb.reverse().toString(); // O(1)
    }
}
