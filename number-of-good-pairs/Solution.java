class Solution {
    public int numIdenticalPairs(int[] nums) { // O(N)
        Map<Integer, Integer> countPerNumber = new HashMap<>(); // O(1)
        int identicalPairs = 0; // O(1)
        
        for (int i : nums) { // O(N)
            if (countPerNumber.containsKey(i)) { // O(1)
                identicalPairs += countPerNumber.get(i); // O(1)
                countPerNumber.put(i, countPerNumber.get(i) + 1); // O(1)
            } else {
                countPerNumber.put(i, 1); // O(1)
            }
        }
        
        return identicalPairs; // O(1)
    }
}
