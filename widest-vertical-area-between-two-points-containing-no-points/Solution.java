class Solution {
    public int maxWidthOfVerticalArea(int[][] points) { // O(N log(N))
        int[] xAxis = new int[points.length]; // O(1)
        int maxWidth = 0; // O(1)
        
        for (int i = 0; i < points.length; i++) { // O(N)
            xAxis[i] = points[i][0]; // O(1)
        }
        
        Arrays.sort(xAxis); // O(N log(N))
    
        for (int i = 1; i < xAxis.length; i++) { // O(N)
            maxWidth = Math.max(maxWidth, xAxis[i] - xAxis[i-1]); // O(1)
        }
        
        return maxWidth; // O(1)
    }
}
