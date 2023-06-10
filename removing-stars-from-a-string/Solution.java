class Solution {
    public String removeStars(String s) { // O(N)
        StringBuilder sb = new StringBuilder(); // O(1)

        for (char c : s.toCharArray()) { // O(N)
            if (c == '*') { // O(1)
                sb.setLength(sb.length() - 1); // O(1)
            } else {
                sb.append(c); // O(1)
            }
        }

        return sb.toString(); // O(N)
    }
}
