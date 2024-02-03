class Solution {
    public int findMin(int[] nums) { // O(log N)
        int n = nums.length - 1; // O(1)
        int left = 0, right = n; // O(1)
        if (nums[left] < nums[right]) return nums[0]; // O(1)
        
        while (left < right) { // O(log N)
            int mid = left + (right - left) / 2; // O(1)
            
            if (nums[mid] > nums[mid + 1]) { // O(1)
                return nums[mid + 1]; // O(1)
            }
            
            if (nums[mid - 1] > nums[mid]) { // O(1)
                return nums[mid]; // O(1)
            }
            
            if (nums[mid] > nums[0]) { // O(1)
                left = mid + 1; // O(1)
            } else {
                right = mid - 1; // O(1)
            }
        }
        
        return nums[0]; // O(1)
    }
}
