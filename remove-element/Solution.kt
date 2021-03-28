class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int { // O(N)
        var size = 0 // O(1)

        nums.forEach { if (it != `val`) nums[size++] = it } // O(N)

        return size // O(1)
    }
}
