class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xAxis = new int[points.length];
        int maxWidth = 0;
        
        for (int i = 0; i < points.length; i++) {
            xAxis[i] = points[i][0];
        }
        
        Arrays.sort(xAxis);
    
        for (int i = 1; i < xAxis.length; i++) {
            maxWidth = Math.max(maxWidth, xAxis[i] - xAxis[i-1]);
        }
        
        return maxWidth;
    }
}
