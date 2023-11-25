public class Solution extends VersionControl {
    public int firstBadVersion(int n) { // O(log N)
        int left = 1, right = n; // O(1)
        
        while (left < right) { // O(log N)
            int mid = left + (right - left) / 2; // O(1)
            
            if (isBadVersion(mid)) { // O(1)
                right = mid; // O(1)
            } else {
                left = mid + 1; // O(1)
            }
        }
                
        return left; // O(1)
    }
}
