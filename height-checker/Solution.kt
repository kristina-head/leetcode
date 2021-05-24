class Solution {
    fun heightChecker(heights: IntArray): Int { // O(N)
        val sortedHeights = heights.copyOf(heights.size) // O(N)
        Arrays.sort(sortedHeights) // O(N)
        var count = 0 // O(1)
        
        for (i in heights.indices) { // O(N)
            if (sortedHeights[i] != heights[i]) { // O(1)
                count++ // O(1)
            }
        }
        
        return count // O(1)
    }
}
