class Solution {
    public int dominantIndex(int[] nums) { // O(N)
        int max = 0; // O(1)
        int maxIndex = -1; // O(1)
        
        for (int i = 0; i < nums.length; i++) { // O(N)
            if (nums[i] > max) { // O(1)
                max = nums[i]; // O(1)
                maxIndex = i; // O(1)
            }
        }
        
        for (int i = 0; i < nums.length; i++) { // O(N)
            if (nums[i] != max && max < nums[i] * 2) { // O(1)
                return -1; // O(1)
            }
        }
        
        return maxIndex; // O(1)
    }
}
