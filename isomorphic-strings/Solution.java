class Solution {
    public boolean isIsomorphic(String s, String t) { // O(N) where N is the length of s and t
        Map<Character, Character> map = new HashMap<>(); // O(1)
        
        for (int i = 0; i < s.length(); i++) { // O(N)
            if (map.containsKey(s.charAt(i))) { // O(1)
                if (map.get(s.charAt(i)) != t.charAt(i)) return false; // O(1)
            } else {
                if (map.containsValue(t.charAt(i))) return false; // O(1)
                
                map.put(s.charAt(i), t.charAt(i)); // O(1)
            }
        }
        
        return true; // O(1)
    }
}
