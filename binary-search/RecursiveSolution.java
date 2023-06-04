class RecursiveSolution {
    public int search(int[] nums, int target) { // O(log N)
        return binarySearch(nums, 0, nums.length - 1, target); // O(log N)
    }

    private int binarySearch(int[] nums, int start, int end, int target) { // O(log N)
        if (start > end) return -1; // O(1)
        int mid = (end / 2) + start; // O(1)

        if (nums[mid] < target) { // O(1)
            return binarySearch(nums, mid + 1, end, target); // O(log N)
        } else if (nums[mid] > target) { // O(1)
            return binarySearch(nums, start, mid - 1, target); // O(log N)
        }
        
        return mid; // O(1)
    }
}
