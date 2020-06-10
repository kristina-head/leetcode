class Solution {
    public int[] plusOne(int[] digits) { // O(N)
        int carryOver = 1; // O(1)
        
        for (int i = digits.length - 1; i >= 0; i--) { // O(N)
            digits[i] += carryOver; // O(1)
            if (digits[i] <= 9) { // O(1)
                return digits; // O(1)
            }
            digits[i] = 0; // O(1)
        }
        
        int[] newDigits = new int[digits.length + 1]; // O(N)
        newDigits[0] = 1; // O(1)
        
        return newDigits; // O(1)
    }
}
