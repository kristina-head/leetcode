class Solution {
    public int removeDuplicates(int[] nums) { // O(N)
        int j = 0; // O(1)
            
        for (int i = 1; i < nums.length; i++) { // O(N)
            if (nums[i] != nums[j]) { // O(1)
                j++; // O(1)
                nums[j] = nums[i]; // O(1)
            }
        }
        
        return j + 1; // O(1)
    }
}
