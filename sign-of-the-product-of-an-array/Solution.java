class Solution {
    public int arraySign(int[] nums) {
        int negativeNums = 0;

        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) negativeNums++;
        }

        return negativeNums % 2 == 0 ? 1 : -1;
    }
}
