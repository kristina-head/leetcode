class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var i = 0
        
        for (j in nums.indices) {
            if (nums[j] != 0) {
                nums[i] = nums[j]
                
                if (j != i) {
                    nums[j] = 0
                }
                
                i++
            }
        }
    }
}
