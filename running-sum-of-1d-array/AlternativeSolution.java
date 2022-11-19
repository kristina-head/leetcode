class AlternativeSolution {
    public int[] runningSum(int[] nums) { // O(N)
        int numsLength = nums.length; // O(1)
        int[] runningSum = new int[numsLength]; // O(N)
        runningSum[0] = nums[0]; // O(1)
        
        for (int i = 1; i < numsLength; i++) { // O(N)
            runningSum[i] = runningSum[i-1] + nums[i]; // O(1)
        }
        
        return runningSum; // O(1)
    }
}
