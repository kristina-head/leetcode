class Solution {
    public int minSubArrayLen(int target, int[] nums) { // O(N)
        int left = 0, windowSum = 0; // O(1)
        int minSubArrayLen = Integer.MAX_VALUE; // O(1)

        for (int right = 0; right < nums.length; right++) { // O(N)
            windowSum += nums[right]; // O(1)

            while (windowSum >= target) { // O(N)
                minSubArrayLen = Math.min(minSubArrayLen, right - left + 1); // O(1)
                windowSum -= nums[left]; // O(1)
                left++; // O(1)
            }
        }

        return minSubArrayLen == Integer.MAX_VALUE ? 0 : minSubArrayLen; // O(1)
    }
}
