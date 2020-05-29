class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        
        for (int number : nums) {
            sum += number; 
        }
        
        int leftSum = 0;
            
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        
        return -1;
    }
}
