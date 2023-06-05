class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = squareDigits(n);
        }

        return n == 1;
    }

    private int squareDigits(int n) {
        int total = 0;
        
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            total += digit * digit;
        }

        return total;
    }
}
