class Solution {
    public int arrayPairSum(int[] nums) { // O(N log N)
        Arrays.sort(nums); // O(N log N)
        int pairSum = 0; // O(1)
        
        for (int i = 0; i < nums.length; i += 2) { // O(N / 2) -> O(N)
            pairSum += nums[i]; // O(1)
        }
        
        return pairSum; // O(1)
    }
}
