class Solution {
    public boolean isHappy(int n) { // O(N)
        Set<Integer> seen = new HashSet<>(); // O(1)

        while (n != 1 && !seen.contains(n)) { // O(1)
            seen.add(n); // O(1)
            n = squareDigits(n); // O(N)
        }

        return n == 1; // O(1)
    }

    private int squareDigits(int n) { // O(N) where N is the number of digits in `n`
        int total = 0; // O(1)
        
        while (n != 0) { // O(N)
            int digit = n % 10; // O(1)
            n /= 10; // O(1)
            total += digit * digit; // O(1)
        }

        return total; // O(1)
    }
}
