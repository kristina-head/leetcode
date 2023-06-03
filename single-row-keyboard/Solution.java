class Solution {
    public int calculateTime(String keyboard, String word) {
        int[] map = new int[keyboard.length()];
        for (int i = 0; i < keyboard.length(); i++) {
            map[keyboard.charAt(i) - 'a'] = i;
        }

        int prev = 0;
        int total = 0;

        for (char c : word.toCharArray()) {
            total += Math.abs(prev - map[c - 'a']);
            prev = map[c - 'a'];
        }

        return total;
    }
}
