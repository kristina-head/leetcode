class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int reversedNum = 0;

        while (x > 0) {
            reversedNum = reversedNum * 10 + x % 10;
            x /= 10;
        }

        return num == reversedNum;
    }
}
