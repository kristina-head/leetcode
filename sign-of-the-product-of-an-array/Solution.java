class Solution {
    public int arraySign(int[] nums) { // O(N)
        int negativeNums = 0; // O(1)

        for (int num : nums) { // O(N)
            if (num == 0) return 0; // O(1)
            if (num < 0) negativeNums++; // O(1)
        }

        return negativeNums % 2 == 0 ? 1 : -1; // O(1)
    }
}
