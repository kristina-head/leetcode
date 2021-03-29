class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        
        for (j in nums.indices) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j]
            }
        }
        
        return i + 1;
    }
}
