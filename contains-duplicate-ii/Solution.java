class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) { // O(N^2) worst case and O(N) average case
        Map<Integer, List<Integer>> indicesByNum = new HashMap<>(); // O(1)
        
        for (int i = 0; i < nums.length; i++) { // O(N)
            int num = nums[i]; // O(1)
            
            if (indicesByNum.containsKey(num)) { // O(1)
                List<Integer> indices = indicesByNum.get(num); // O(1)
                
                for (int j : indices) { // O(N) worst case all elements in nums are the same
                    if (Math.abs(i - j) <= k) return true; // O(1)
                }
                
                indices.add(i); // O(1)
            } else {
                List<Integer> indices = new ArrayList<>(); // O(1)
                indices.add(i); // O(1)
                indicesByNum.put(num, indices); // O(1)
            }
        }
        
        return false; // O(1)
    }
}
