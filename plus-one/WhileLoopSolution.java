class WhileLoopSolution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;

        while (i >= 0 && digits[i] == 9) {
            digits[i] = 0;
            i--;
        }
        
        if (i == -1) {
            digits = new int[digits.length+1];
            digits[0] = 1;
        } else {
            digits[i] += 1;   
        }
        
        return digits;
    }
}
