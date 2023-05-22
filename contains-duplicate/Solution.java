class Solution {
    public boolean containsDuplicate(int[] nums) { // O(N)
        Set<Integer> set = new HashSet<>(); // O(1)
        
        for (int num : nums) { // O(N)
            if (!set.add(num)) return true; // O(1)
        }
        
        return false; // O(1)
    }
}
