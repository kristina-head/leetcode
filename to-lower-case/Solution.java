class Solution {
    public String toLowerCase(String str) { // O(N)
        char[] letters = str.toCharArray(); // O(N)
        for (int i = 0; i < str.length(); i++) { // O(N)
            int ascii = letters[i]; // O(1)
            if (ascii > 64 && ascii < 91) { // O(1)
                ascii += 32; // O(1)
                letters[i] = (char) ascii; // O(1)
            }
        }
        String string = new String(letters); // O(N)
        return string; // O(1)
    }
}
