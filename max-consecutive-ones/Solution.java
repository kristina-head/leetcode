class Solution {
    public int findMaxConsecutiveOnes(int[] nums) { // O(N)
        int max = 0; // O(1)
        int start = 0; // O(1)
        
        for (int end = 0; end < nums.length; end++) { // O(N)
            if (nums[end] == 1) { // O(1)
                max = Math.max(max, end - start + 1); // O(1)
            } else {
                start = end + 1; // O(1)
            }
        }
        
        return max; // O(1)
    }
}
