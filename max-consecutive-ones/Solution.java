class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int start = 0;
        
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 1) {
                max = Math.max(max, end - start + 1);
            } else {
                start = end + 1;
            }
        }
        
        return max;
    }
}
