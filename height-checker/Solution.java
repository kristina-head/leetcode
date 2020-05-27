class Solution {
    public int heightChecker(int[] heights) { // O(N)
        int[] sortedHeights = Arrays.copyOf(heights, heights.length); // O(N)
        Arrays.sort(sortedHeights); // O(N)
        int count = 0; // O(1)
        
        for (int i = 0; i < heights.length; i++) { // O(N)
            if (heights[i] != sortedHeights[i]) { // O(1)
                count++; // O(1)
            }
        }
        
        return count; // O(1)
    }
}
