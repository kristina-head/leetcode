class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNums = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int value = Math.abs(nums[i]) - 1;
            
            if (nums[value] > 0) {
                nums[value] = -nums[value];
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missingNums.add(i + 1);
            }
        }
        
        return missingNums;
    }
}
