class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var size = 0

        nums.forEach { if (it != `val`) nums[size++] = it }

        return size
    }
}
