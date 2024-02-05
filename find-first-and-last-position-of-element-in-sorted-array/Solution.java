class Solution {
    public int[] searchRange(int[] nums, int target) { // O(log N)
        int[] range = new int[] { -1, -1 }; // O(1)
        if (nums.length == 0 ||
            nums[0] > target ||
            nums[nums.length - 1] < target) return range; // O(1)

        range[0] = findBound(nums, target, true); // O(log N)
        if (range[0] == -1) return range; // O(1)
        range[1] = findBound(nums, target, false); // O(log N)

        return range; // O(1)
    }

    private int findBound(int[] nums, int target, boolean isFirst) { // O(log N)
        int begin = 0, end = nums.length - 1; // O(1)
        
        while (begin <= end) { // O(log N)
            int mid = begin + (end - begin) / 2; // O(1)

            if (nums[mid] == target) { // O(1)
                if (isFirst) { // O(1)
                    if (mid == begin || nums[mid - 1] != target) return mid; // O(1)
                    end = mid - 1; // O(1)
                } else {
                    if (mid == end || nums[mid + 1] != target) return mid; // O(1)
                    begin = mid + 1; // O(1)
                }
            } else if (nums[mid] > target) { // O(1)
                end = mid - 1; // O(1)
            } else {
                begin = mid + 1; // O(1)
            }
        }

        return -1; // O(1)
    }
}
