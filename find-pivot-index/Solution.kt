class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var sum = nums.sum()
        var leftSum = 0
                
        for (i in nums.indices) {
            if (leftSum == sum - leftSum - nums[i]) return i
            leftSum += nums[i]
        }
        
        return -1
    }
}
