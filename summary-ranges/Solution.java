class Solution {
    public List<String> summaryRanges(int[] nums) { // O(N)
        List<String> ranges = new ArrayList<>(); // O(1)

        for (int i = 0; i < nums.length; i++) { // O(N)
            int start = nums[i]; // O(1)

            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) i++; // O(N)

            if (start != nums[i]) { // O(1)
                ranges.add(start + "->" + nums[i]); // O(1)
            } else {
                ranges.add(String.valueOf(start)); // O(log N)
            }
        }

        return ranges; // O(1)
    }
}
