class Solution {
    public int countDigits(int num) { // O(N) where N is the number of digits in num
        int n = num; // O(1)
        int divisibleDigits = 0; // O(1)

        while (n > 0) { // O(N)
            int val = n % 10; // O(1)
            if (num % val == 0) divisibleDigits++; // O(1)
            n /= 10; // O(1)
        }

        return divisibleDigits; // O(1)
    }
}
