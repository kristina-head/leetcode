class Solution {
    public int[] intersection(int[] nums1, int[] nums2) { // O(N + M)
        Set<Integer> set1 = new HashSet<>(); // O(1)
        Set<Integer> set2 = new HashSet<>(); // O(1)
        
        for (int num : nums1) set1.add(num); // O(N)
        for (int num : nums2) set2.add(num); // O(M)
        
        set1.retainAll(set2); // O(min(N, M))
        
        int[] intersections = new int[set1.size()]; // O(1)
        int i = 0; // O(1)
        for (int num : set1) intersections[i++] = num; // O(N) worst case
        
        return intersections; // O(1)
    }
}
