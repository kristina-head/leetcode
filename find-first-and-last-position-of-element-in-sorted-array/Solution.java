class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[] { -1, -1 };
        if (nums.length == 0 ||
            nums[0] > target ||
            nums[nums.length - 1] < target) return range;

        range[0] = findBound(nums, target, true);
        if (range[0] == -1) return range;
        range[1] = findBound(nums, target, false);

        return range;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int begin = 0, end = nums.length - 1;
        
        while (begin <= end) {
            int mid = (end / 2) + begin;

            if (nums[mid] == target) {
                if (isFirst) {
                    if (mid == begin || nums[mid - 1] != target) return mid;
                    end = mid - 1;
                } else {
                    if (mid == end || nums[mid + 1] != target) return mid;
                    begin = mid + 1;
                }
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }

        return -1;
    }
}
