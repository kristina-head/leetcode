class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit { // O(N)
        var i = m - 1 // O(1)
        var j = n - 1 // O(1)
        var k = m + n - 1 // O(1)
        
        while (k >= 0) { // O(N)
            if (i < 0 || j >= 0 && nums1[i] < nums2[j]) { // O(1)
                nums1[k--] = nums2[j--] // O(1)
            } else {
                nums1[k--] = nums1[i--] // O(1)
            }
        }
    }
}
