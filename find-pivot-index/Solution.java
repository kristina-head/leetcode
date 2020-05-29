class Solution {
    public int pivotIndex(int[] nums) { // O(N)
        int sum = 0; // O(1)
        
        for (int number : nums) { // O(N)
            sum += number; // O(1)
        }
        
        int leftSum = 0; // O(1)
            
        for (int i = 0; i < nums.length; i++) { // O(N)
            if (leftSum == sum - leftSum - nums[i]) { // O(1)
                return i; // O(1)
            }
            leftSum += nums[i]; // O(1)
        }
        
        return -1; // O(1)
    }
}
