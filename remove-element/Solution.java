class Solution {
    public int removeElement(int[] nums, int val) { // O(N)
        int j = 0; // O(1)
        
        for (int i = 0; i < nums.length; i++) { // O(N)
            if (nums[i] != val) { // O(1)
                nums[j] = nums[i]; // O(1)
                j++; // O(1)
            }
        }
        
        return j; // O(1)
    }
}
