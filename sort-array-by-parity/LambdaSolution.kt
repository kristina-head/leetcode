class LambdaSolution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var i = 0
        
        for ((index, value) in nums.withIndex()) {
            if (value % 2 == 0) {
                nums[i++] = value.also { nums[index] = nums[i-1] }
            }
        }
        
        return nums
    }
}
