class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            groupedAnagrams.computeIfAbsent(new String(chars), it -> new ArrayList<>()).add(s);
        }
        
        return new ArrayList<>(groupedAnagrams.values());
    }
}
