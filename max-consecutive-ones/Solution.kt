class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var count = 0
        
        for (i in nums.indices) {
            if (nums[i] == 1) {
                count++
                if (count > max) {
                    max = count
                }
            } else {
                count = 0
            }
        }
        
        return max
    }
}
