class Solution {
    public List<List<String>> groupAnagrams(String[] strs) { // O(N * M log M) where N is the number of Strings in strs and M is the length of the String
        Map<String, List<String>> groupedAnagrams = new HashMap<>(); // O(1)
        
        for (String s : strs) { // O(N)
            char[] chars = s.toCharArray(); // O(M)
            Arrays.sort(chars); // O(M log M)
            groupedAnagrams.computeIfAbsent(new String(chars), it -> new ArrayList<>()).add(s); // O(M)
        }
        
        return new ArrayList<>(groupedAnagrams.values()); // O(N)
    }
}
