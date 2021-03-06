class Solution {
    fun findNumbers(nums: IntArray): Int { // O(N)
        var count = 0 // O(1)
        
        nums.forEach { // O(N)
            if (it.toString().length % 2 == 0) count++ // O(1)
        }
        
        return count // O(1)
    }
}
