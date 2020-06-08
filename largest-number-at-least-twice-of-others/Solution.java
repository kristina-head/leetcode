class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int maxIndex = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && max < nums[i] * 2) {
                return -1;
            }
        }
        
        return maxIndex;
    }
}
