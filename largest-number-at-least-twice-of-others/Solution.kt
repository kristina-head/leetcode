class Solution {
    fun dominantIndex(nums: IntArray): Int { // O(N)
        var max = nums[0] // O(1)
        var maxIndex = 0 // O(1)
        
        for (i in nums.indices) { // O(N)
            if (nums[i] > max) { // O(1)
                max = nums[i] // O(1)
                maxIndex = i // O(1)
            }
        }
        
        for (i in nums.indices) { // O(N)
            if (i != maxIndex && max < nums[i] * 2) return -1 // O(1)
        }
        
        return maxIndex // O(1)
    }
}
