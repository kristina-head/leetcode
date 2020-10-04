class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int intervals = startTime.length;
        int count = 0;
        
        for (int i = 0; i < intervals; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                count++;
            }
        }
        
        return count;
    }
}
