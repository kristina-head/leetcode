class Solution {
    fun dominantIndex(nums: IntArray): Int {
        var max = nums[0]
        var maxIndex = 0
        
        for (i in nums.indices) {
            if (nums[i] > max) {
                max = nums[i]
                maxIndex = i
            }
        }
        
        for (i in nums.indices) {
            if (i != maxIndex && max < nums[i] * 2) return -1
        }
        
        return maxIndex
    }
}
