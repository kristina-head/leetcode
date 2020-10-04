class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) { // O(N)
        int intervals = startTime.length; // O(1)
        int count = 0; // O(1)
        
        for (int i = 0; i < intervals; i++) { // O(N)
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) { // O(1)
                count++; // O(1)
            }
        }
        
        return count; // O(1)
    }
}
