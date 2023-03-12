class Solution {
    public int romanToInt(String s) { // O(N) where N is the number of chars in s
        Map<Character, Integer> map = new HashMap<>(); // O(1)
        map.put('I', 1); // O(1)
        map.put('V', 5); // O(1)
        map.put('X', 10); // O(1)
        map.put('L', 50); // O(1)
        map.put('C', 100); // O(1)
        map.put('D', 500); // O(1)
        map.put('M', 1000); // O(1)

        int romanInt = 0; // O(1)

        for (int i = s.length() - 1; i >= 0; i--) { // O(N)
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) { // O(1)
                romanInt += map.get(s.charAt(i)) - map.get(s.charAt(i - 1)); // O(1)
                i--; // O(1)
            } else {
                romanInt += map.get(s.charAt(i)); // O(1)
            }
        }

        return romanInt; // O(1)
    }
}
