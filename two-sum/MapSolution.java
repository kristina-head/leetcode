class MapSolution {
    public int[] twoSum(int[] nums, int target) { // O(N)
        Map<Integer, Integer> indexMap = new HashMap<>(nums.length); // O(1)

        for (int i = 0; i < nums.length; i++) { // O(N)
            int counterpart = target - nums[i]; // O(1)
            
            if (indexMap.containsKey(counterpart)) { // O(1)
                return new int[] {i, indexMap.get(counterpart)}; // O(1)
            }

            indexMap.put(nums[i], i); // O(1)
        }

        return null; // O(1)
    }
}
