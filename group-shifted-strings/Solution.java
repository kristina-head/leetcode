class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> sequences = new HashMap<>();
        
        for (String s : strings) {
            String key = getHash(s);
            sequences.computeIfAbsent(key, it -> new ArrayList<>()).add(s);
        }
        
        return new ArrayList<>(sequences.values());
    }

    private String getHash(String s) {
        char[] chars = s.toCharArray();
        StringBuilder hash = new StringBuilder();

        for (int i = 1; i < chars.length; i++) {
            hash.append((chars[i] - chars[i - 1] + 26) % 26 + 'a');
        }

        return hash.toString();
    }
}
