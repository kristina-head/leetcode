class Solution {
    fun pivotIndex(nums: IntArray): Int { // O(N)
        val sum = nums.sum() // O(N)
        var leftSum = 0 // O(1)
                
        for (i in nums.indices) { // O(N)
            if (leftSum == sum - leftSum - nums[i]) return i // O(1)
            leftSum += nums[i] // O(1)
        }
        
        return -1 // O(1)
    }
}
