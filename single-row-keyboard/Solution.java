class Solution {
    public int calculateTime(String keyboard, String word) { // O(N) where N is the number of chars in word
        int[] map = new int[keyboard.length()]; // O(1)
        for (int i = 0; i < keyboard.length(); i++) { // O(26) -> O(1)
            map[keyboard.charAt(i) - 'a'] = i; // O(1)
        }

        int prev = 0; // O(1)
        int total = 0; // O(1)

        for (char c : word.toCharArray()) { // O(N)
            total += Math.abs(prev - map[c - 'a']); // O(1)
            prev = map[c - 'a']; // O(1)
        }

        return total; // O(1)
    }
}
