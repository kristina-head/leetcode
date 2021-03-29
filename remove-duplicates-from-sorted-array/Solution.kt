class Solution {
    fun removeDuplicates(nums: IntArray): Int { // O(N)
        var i = 0 // O(1) 
        
        for (j in nums.indices) { // O(N)
            if (nums[j] != nums[i]) { // O(1)
                nums[++i] = nums[j] // O(1)
            }
        }
        
        return i + 1 // O(1)
    }
}
