class Solution {
    public int singleNumber(int[] nums) { // O(N)
        Set<Integer> set = new HashSet<>(); // O(1)
        
        for (int num : nums) { // O(N)
            if (set.contains(num)) { // O(1)
                set.remove(num); // O(1)
            } else {
                set.add(num); // O(1)
            }
        }
        
        return set.iterator().next(); // O(1)
    }
}
