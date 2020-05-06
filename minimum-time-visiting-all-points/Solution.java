class Solution {
    public int minTimeToVisitAllPoints(int[][] points) { // O(N)
        int time = 0; // O(1)
        
        for (int i = 0; i < points.length-1; i++) { // O(N)
            int x = points[i][0]; // O(1)
            int y = points[i][1]; // O(1)
            
            int a = points[i+1][0]; // O(1)
            int b = points[i+1][1]; // O(1)
            
            time += Math.max(Math.abs(a - x), Math.abs(b - y)); // O(1)
        }
        
        return time; // O(1)
    }
}
