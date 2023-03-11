class Solution {
    public boolean isPalindrome(int x) { // O(N) where N is the number of digits in x
        int num = x; // O(1)
        int reversedNum = 0; // O(1)

        while (x > 0) { // O(N)
            reversedNum = reversedNum * 10 + x % 10; // O(1)
            x /= 10; // O(1)
        }

        return num == reversedNum; // O(1)
    }
}
