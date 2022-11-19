class AlternativeSolution {
    public int[] runningSum(int[] nums) {
        int numsLength = nums.length;
        int[] runningSum = new int[numsLength];
        runningSum[0] = nums[0];
        
        for (int i = 1; i < numsLength; i++) {
            runningSum[i] = runningSum[i-1] + nums[i];
        }
        
        return runningSum;
    }
}
