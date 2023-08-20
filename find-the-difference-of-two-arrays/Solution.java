class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        for (int num : nums1) {
            set2.remove(num);
        }

        for (int num : nums2) {
            set1.remove(num);
        }

        return List.of(new ArrayList(set1), new ArrayList(set2));
    }
}
