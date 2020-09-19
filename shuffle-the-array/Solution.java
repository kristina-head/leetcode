class Solution {
    public int[] shuffle(int[] nums, int n) { // O(N*2)
        int[] numsShuffled = new int[n*2]; // O(N*2)
        
        for (int i = 0; i < n; i++) { // O(N)
            numsShuffled[i*2] = nums[i]; // O(1)
            numsShuffled[i*2+1] = nums[i+n]; // O(1)
        }
        
        return numsShuffled; // O(1)
    }
}
