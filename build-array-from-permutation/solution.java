class Solution {
    public int[] buildArray(int[] nums) { // O(N)
        int[] ans = new int[nums.length]; // O(N)
        
        for (int i = 0; i < nums.length; i++) { // O(N)
            ans[i] = nums[nums[i]]; // O(1)
        }
        
        return ans; // O(1)
    }
}
