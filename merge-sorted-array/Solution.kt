class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m - 1
        var j = n - 1
        var k = m + n - 1
        
        while (k >= 0) {
            if (i < 0 || j >= 0 && nums1[i] < nums2[j]) {
                nums1[k--] = nums2[j--]
            } else {
                nums1[k--] = nums1[i--]
            }
        }
    }
}
