class Solution {
    public int[] runningSum(int[] nums) { // O(N)
        for (int i = 1; i < nums.length; i++) { // O(N)
            nums[i] += nums[i-1]; // O(1)
        }
        return nums; // O(1)
    }
}
