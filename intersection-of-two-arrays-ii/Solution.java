class Solution {
    public int[] intersect(int[] nums1, int[] nums2) { // O(N + M)
        Map<Integer, Integer> map = new HashMap<>(); // O(1)
        List<Integer> result = new ArrayList<>(); // O(1)
        
        for (int num : nums1) { // O(N)
            map.put(num, map.getOrDefault(num, 0) + 1); // O(1)
        }
        
        for (int num : nums2) { // O(M)
            int val = map.getOrDefault(num, 0); // O(1)
            
            if (val > 0) { // O(1)
                result.add(num); // O(1)
                map.replace(num, val - 1); // O(1)
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray(); // O(N) worst case all elements in nums1 appear in nums2
    }
}
