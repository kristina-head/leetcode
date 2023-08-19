class Solution {
    public List<List<String>> groupStrings(String[] strings) { // O(N * M) where N is the number of Strings in strings and M is the length of each String
        Map<String, List<String>> sequences = new HashMap<>(); // O(1)
        
        for (String s : strings) { // O(N)
            String key = getHash(s); // O(M)
            sequences.computeIfAbsent(key, it -> new ArrayList<>()).add(s); // O(1)
        }
        
        return new ArrayList<>(sequences.values()); // O(N)
    }

    private String getHash(String s) { // O(M)
        char[] chars = s.toCharArray(); // O(M)
        StringBuilder hash = new StringBuilder(); // O(1)

        for (int i = 1; i < chars.length; i++) { // O(M)
            hash.append((chars[i] - chars[i - 1] + 26) % 26 + 'a'); // O(1)
        }

        return hash.toString(); // O(M)
    }
}
