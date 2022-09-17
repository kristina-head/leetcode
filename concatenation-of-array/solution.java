class Solution {
    public int[] getConcatenation(int[] nums) { // O(N)
        int n = nums.length; // O(1)
        int[] ans = new int[n * 2]; // O(N)
        
        for (int i = 0; i < n; i++) { // O(N)
            ans[i] = nums[i]; // O(1)
            ans[i + n] = nums[i]; // O(1)
        }
        
        return ans; // O(1)
    }
}
