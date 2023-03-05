class Solution {
    public String decodeMessage(String key, String message) { // O(N + M)
        int[] subTable = new int[128]; // O(1)
        subTable[' '] = ' '; // O(1)
        int alphabet = 'a'; // O(1)

        for (char c : key.toCharArray()) { // O(N)
            if (subTable[c] == 0) subTable[c] = alphabet++; // O(1)
        }

        char[] decodedMessage = new char[message.length()]; // O(1)

        for (int i = 0; i < message.length(); i++) { // O(M)
            decodedMessage[i] = (char)subTable[message.charAt(i)]; // O(1)
        }

        return new String(decodedMessage); // O(M)
    }
}
