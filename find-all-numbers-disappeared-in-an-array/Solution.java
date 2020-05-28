class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) { // O(N)
        List<Integer> missingNums = new ArrayList<>(); // O(1)
        
        for (int i = 0; i < nums.length; i++) { // O(N)
            int value = Math.abs(nums[i]) - 1; // O(1)
            
            if (nums[value] > 0) { // O(1)
                nums[value] = -nums[value]; // O(1)
            }
        }
        
        for (int i = 0; i < nums.length; i++) { // O(N)
            if (nums[i] > 0) { // O(1)
                missingNums.add(i + 1); // O(1)
            }
        }
        
        return missingNums; // O(1)
    }
}
