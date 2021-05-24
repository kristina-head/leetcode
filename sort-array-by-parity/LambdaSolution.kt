class LambdaSolution {
    fun sortArrayByParity(nums: IntArray): IntArray { // O(N)
        var i = 0 // O(1)
        
        for ((index, value) in nums.withIndex()) { // O(N)
            if (value % 2 == 0) { // O(1)
                nums[i++] = value.also { nums[index] = nums[i-1] } // O(1)
            }
        }
        
        return nums // O(1)
    }
}
