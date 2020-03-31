class Solution {
    public int findNumbers(int[] nums) { // O(N*M)
        int count = 0; // O(1)
        int digits = 0; // O(1)
        
        for (int i = 0; i < nums.length; i++) { // O(M*N)
            while (nums[i] != 0) { // O(N)
                nums[i] /= 10; // O(1)
                digits++; // O(1)
            }
            if (digits % 2 == 0) { // O(1)
                count++; // O(1)
            }
            digits = 0; // O(1)
        }

        return count; // O(1)
    }
}
