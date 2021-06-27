class WhileLoopSolution {
    public int[] plusOne(int[] digits) { // O(N)
        int i = digits.length-1; // O(1)

        while (i >= 0 && digits[i] == 9) { // O(N)
            digits[i] = 0; // O(1)
            i--; // O(1)
        }
        
        if (i == -1) { // O(1)
            digits = new int[digits.length+1]; // O(N)
            digits[0] = 1; // O(1)
        } else {
            digits[i] += 1; // O(1)
        }
        
        return digits; // O(1)
    }
}
