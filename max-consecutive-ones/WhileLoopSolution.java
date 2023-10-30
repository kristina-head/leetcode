class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        int n = nums.length;
        int maxConsecutiveOnes = 0;
        int left = 0, right = 0;
        
        while (left < n && right < n) {
            while (left < n && nums[left] == 0) left++;
            right = left;

            while (right < n && nums[right] == 1) right++;

            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, right = left);
            left = right;
        }
        
        return maxConsecutiveOnes;
    }
}
