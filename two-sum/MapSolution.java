class MapSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int counterpart = target - nums[i];
            
            if (indexMap.containsKey(counterpart)) {
                return new int[] {i, indexMap.get(counterpart)};
            }

            indexMap.put(nums[i], i);
        }

        return null;
    }
}
