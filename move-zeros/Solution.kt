class Solution {
    fun moveZeroes(nums: IntArray): Unit { // O(N)
        var i = 0 // O(1)
        
        for (j in nums.indices) { // O(N)
            if (nums[j] != 0) { // O(1)
                nums[i] = nums[j] // O(1)
                
                if (j != i) { // O(1)
                    nums[j] = 0 // O(1)
                }
                
                i++ // O(1)
            }
        }
    }
}
