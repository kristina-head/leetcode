class Solution {
    public int search(int[] nums, int target) { // O(log N)
        int start = 0; // O(1)
        int end = nums.length - 1; // O(1)
        int index = -1; // O(1)

        while (start <= end) { // O(log N)
            int mid = (end / 2) + start; // O(1)
            
            if (nums[mid] < target) { // O(1)
                start = mid + 1; // O(1)
            } else if (nums[mid] > target) { // O(1)
                end = mid - 1; // O(1)
            } else if (nums[mid] == target) { // O(1)
                index = mid; // O(1)
                break; // O(1)
            }
        }

        return index; // O(1)
    }
}
