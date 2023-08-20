class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) { // O(N + M)
        Set<Integer> set1 = new HashSet<>(); // O(1)
        Set<Integer> set2 = new HashSet<>(); // O(1)

        for (int num : nums1) { // O(N)
            set1.add(num); // O(1)
        }

        for (int num : nums2) { // O(M)
            set2.add(num); // O(1)
        }

        for (int num : nums1) { // O(N)
            set2.remove(num); // O(1)
        }

        for (int num : nums2) { // O(M)
            set1.remove(num); // O(1)
        }

        return List.of(new ArrayList(set1), new ArrayList(set2)); // O(N + M)
    }
}
