class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray { // O(N)
        var i = 0 // O(1)
        var j = nums.size - 1 // O(1)
        
        while (i < j) { // O(N)
            if (nums[i] % 2 > nums[j] % 2) { // O(1)
                val temp = nums[i] // O(1)
                nums[i] = nums[j] // O(1)
                nums[j] = temp // O(1)
            }
            
            if (nums[i] % 2 == 0) i++ // O(1)
            if (nums[j] % 2 == 1) j-- // O(1)
        }
        
        return nums // O(1)
    }
}
