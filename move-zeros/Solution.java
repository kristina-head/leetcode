class Solution {
    public void moveZeroes(int[] nums) { // O(N)
        int index = 0; // O(1)   
        
        for (int num : nums) { // O(N)
            if (num != 0) { // O(1)
                nums[index++] = num; // O(1)
            }
        }
        
        for (int i = index; i < nums.length; i++) { // O(N)
            nums[i] = 0; // O(1)
        }
    }
}
