class SolutionImproved {
    public int removeElement(int[] nums, int val) { // O(N)
        int i = 0; // O(1)
        int j = nums.length; // O(1)
        
        while (i < j) { // O(N)
            if (nums[i] == val) { // O(1)
                nums[i] = nums[j - 1]; // O(1)
                j--; // O(1)
            } else {
                i++; // O(1)
            }
        }
        
        return j; // O(1)
    }
}
