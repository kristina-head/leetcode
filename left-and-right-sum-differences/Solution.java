class Solution {
    public int[] leftRigthDifference(int[] nums) { // O(N) where N is the number of elements in nums
        int length = nums.length; // O(1)
        int count = 0; // O(1)
        int[] left = new int[length]; // O(1)
        int[] right = new int[length]; // O(1)
        int[] answer = new int[length]; // O(1)

        for (int i = 0; i < length - 1; i++) { // O(N)
            count += nums[i]; // O(1)
            left[i + 1] = count; // O(1)
        }

        count = 0; // O(1)

        for (int i = length - 1; i > 0; i--) { // O(N)
            count += nums[i]; // O(1)
            right[i - 1] = count; // O(1)
        }

        for (int i = 0; i < length; i++) { // O(N)
            if (i == 0) answer[i] = right[i]; // O(1)
            if (i == length - 1) answer[i] = left[i]; // O(1)

            answer[i] = Math.abs(left[i] - right[i]); // O(1)
        }

        return answer; // O(1)
    }
}
