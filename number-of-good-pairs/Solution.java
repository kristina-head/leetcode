class Solution {
    public int numIdenticalPairs(int[] nums) { // O(M+N)
        Map<Integer, Integer> countPerNumber = new HashMap<>(); // O(1)
        int identicalPairs = 0; // O(1)
        
        for (int i = 0; i < nums.length; i++) { // O(M)
            int count = countPerNumber.containsKey(nums[i]) ? countPerNumber.get(nums[i]) : 0; // O(1)
            countPerNumber.put(nums[i], count + 1); // O(1)
        }
        
        for (int count : countPerNumber.values()) { // O(N)
            identicalPairs += count * (count - 1) / 2; // O(1)
        }
        
        return identicalPairs; // O(1)
    }
}
