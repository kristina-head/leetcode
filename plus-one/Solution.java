class Solution {
    public int[] plusOne(int[] digits) {
        int carryOver = 1;
        
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carryOver;
            if (digits[i] <= 9) {
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        
        return newDigits;
    }
}
