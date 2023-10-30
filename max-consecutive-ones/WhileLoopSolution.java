class Solution {
    public int findMaxConsecutiveOnes(int[] nums) { // O(N)
        if (nums.length == 1) return nums[0]; // O(1)
        
        int n = nums.length; // O(1)
        int maxConsecutiveOnes = 0; // O(1)
        int left = 0, right = 0; // O(1)
        
        while (left < n && right < n) { // O(N)
            while (left < n && nums[left] == 0) left++; // O(N)
            right = left; // O(1)

            while (right < n && nums[right] == 1) right++; // O(N)

            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, right = left); // O(1)
            left = right; // O(1)
        }
        
        return maxConsecutiveOnes; // O(1)
    }
}
