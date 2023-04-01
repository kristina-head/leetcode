class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int length = nums.length;
        int count = 0;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] answer = new int[length];

        for (int i = 0; i < length - 1; i++) {
            count += nums[i];
            left[i + 1] = count;
        }

        count = 0;

        for (int i = length - 1; i > 0; i--) {
            count += nums[i];
            right[i - 1] = count;
        }

        for (int i = 0; i < length; i++) {
            if (i == 0) answer[i] = right[i];
            if (i == length - 1) answer[i] = left[i];

            answer[i] = Math.abs(left[i] - right[i]);
        }

        return answer;
    }
}
