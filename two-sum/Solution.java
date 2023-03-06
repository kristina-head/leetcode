class Solution {
    public int[] twoSum(int[] nums, int target) { // O(N^2)
        for (int i = 0; i < nums.length - 1; i++) { // O(N)
            for (int j = i + 1; j < nums.length; j++) { // O(N)
                if (nums[i] + nums[j] == target) { // O(1)
                    return new int[] {i, j}; // O(1)
                }
            }
        }

        return null; // O(1)
    }
}
