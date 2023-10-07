class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int prev = 0, current = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                prev = current + 1;
                current = 0;
            } else {
                current++;
            }
            
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, prev + current);
        }
        
        return maxConsecutiveOnes;
    }
}
