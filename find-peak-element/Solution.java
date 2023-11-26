class Solution {
    public int findPeakElement(int[] nums) { // O(log N)
        int left = 0, right = nums.length - 1; // O(1)
        
        while (left < right) { // O(log N)
            int mid = left + (right - left) / 2; // O(1)
            
            if (nums[mid] < nums[mid + 1]) { // O(1)
                left = mid + 1; // O(1)
            } else {
                right = mid; // O(1)
            }
        }
        
        return left; // O(1)
    }
}
