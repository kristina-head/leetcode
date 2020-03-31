class Solution {
    public int subtractProductAndSum(int n) { // O(N)
        int digit = 0; // O(1)
        int product = 1; // O(1)
        int sum = 0; // O(1)
        
        while (n != 0) { // O(N)
            digit = n % 10; // O(1)
            product *= digit; // O(1)
            sum += digit; // O(1)
            n /= 10; // O(1)
        }
        
        return product - sum; // O(1)
    }
}
