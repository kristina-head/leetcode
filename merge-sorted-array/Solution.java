class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) { // O(K)
        for (int i = m - 1, j = n - 1, k = m + n - 1; k >= 0; k--) { // O(K)
            if (j < 0 || (i >= 0 && nums1[i] > nums2[j])) { // O(1)
                nums1[k] = nums1[i--]; // O(1)
            } else {
                nums1[k] = nums2[j--]; // O(1)
            }
        }
    }
}
