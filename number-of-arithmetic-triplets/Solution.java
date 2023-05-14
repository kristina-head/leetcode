class Solution {
    public int arithmeticTriplets(int[] nums, int diff) { // O(N)
        Set<Integer> set = new HashSet<>(nums.length); // O(1)
        int count = 0; // O(1)

        for (int num : nums) { // O(N)
            if (set.contains(num - diff) && set.contains(num - diff * 2)) count++; // O(1)

            set.add(num); // O(1)
        }

        return count; // O(1)
    }
}
