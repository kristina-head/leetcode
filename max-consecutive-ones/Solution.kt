class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int { // O(N)
        var max = 0 // O(1)
        var count = 0 // O(1)
        
        for (i in nums.indices) { // O(N)
            if (nums[i] == 1) { // O(1)
                count++ // O(1)
                if (count > max) { // O(1)
                    max = count // O(1)
                }
            } else { 
                count = 0 // O(1)
            }
        }
        
        return max // O(1)
    }
}
