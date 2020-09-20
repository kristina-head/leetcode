class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countPerNumber = new HashMap<>();
        int identicalPairs = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int count = countPerNumber.containsKey(nums[i]) ? countPerNumber.get(nums[i]) : 0;
            countPerNumber.put(nums[i], count + 1);
        }
        
        for (int count : countPerNumber.values()) {
            identicalPairs += count * (count - 1) / 2;
        }
        
        return identicalPairs;
    }
}
