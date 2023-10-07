class Solution {
    public int findMaxConsecutiveOnes(int[] nums) { // O(N)
        int maxConsecutiveOnes = 0; // O(1)
        int prev = 0, current = 0; // O(1)
        
        for (int i = 0; i < nums.length; i++) { // O(N)
            if (nums[i] == 0) { // O(1)
                prev = current + 1; // O(1)
                current = 0; // O(1)
            } else {
                current++; // O(1)
            }
            
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, prev + current); // O(1)
        }
        
        return maxConsecutiveOnes; // O(1)
    }
}
