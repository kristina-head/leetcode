class Solution {
    public String decodeMessage(String key, String message) {
        int[] subTable = new int[128];
        subTable[' '] = ' ';
        int alphabet = 'a';

        for (char c : key.toCharArray()) {
            if (subTable[c] == 0) subTable[c] = alphabet++;
        }

        char[] decodedMessage = new char[message.length()];

        for (int i = 0; i < message.length(); i++) {
            decodedMessage[i] = (char)subTable[message.charAt(i)];
        }

        return new String(decodedMessage);
    }
}
