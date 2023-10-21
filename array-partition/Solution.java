class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int pairSum = 0;
        
        for (int i = 0; i < nums.length; i += 2) {
            pairSum += nums[i];
        }
        
        return pairSum;
    }
}
