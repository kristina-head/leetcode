class Solution {
    public int search(int[] nums, int target) { // O(log N)
        int start = 0, end = nums.length - 1; // O(1)
        if (target < nums[start] && target > nums[end]) return -1; // O(1)

        while (start <= end) { // O(log N)
            int mid = start + (end - start) / 2; // O(1)

            if (nums[mid] == target) { // O(1)
                return mid; // O(1)
            } else if (nums[mid] >= nums[start]) { // O(1)
                if (target >= nums[start] && target < nums[mid]) { // O(1)
                    end = mid - 1; // O(1)
                } else {
                    start = mid + 1; // O(1)
                } 
            } else {
                if (target <= nums[end] && target > nums[mid]) { // O(1)
                    start = mid + 1; // O(1)
                } else {
                    end = mid - 1; // O(1)
                }
            }
        }

        return -1; // O(1)
    }
}
