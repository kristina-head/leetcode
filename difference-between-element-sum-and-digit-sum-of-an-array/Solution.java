class Solution {
    public int differenceOfSum(int[] nums) { // O(N*M) where N is number of elements in nums and M is the number of digits in each element
        int elementSum = 0; // O(1)
        int digitSum = 0; // O(1)

        for (int i = 0; i < nums.length; i++) { // O(N)
            elementSum += nums[i]; // O(1)

            while (nums[i] > 0) { // O(M)
                digitSum += nums[i] % 10; // O(1)
                nums[i] /= 10; // O(1)
            }
        }

        return Math.abs(elementSum - digitSum); // O(1)
    }
}
