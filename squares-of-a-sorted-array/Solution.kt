class Solution {
    fun sortedSquares(nums: IntArray): IntArray { // O(N log N)
        for (i in nums.indices) { // O(N)
            nums[i] = nums[i] * nums[i] // O(1)
        }
        
        nums.sort() // O(N log N)
        
        return nums // O(1)
    }
}
