class Solution {
    public int minimumSum(int num) {
        int[] nums = new int[4];
        int i = 0;
        
        while (num > 0) {
            nums[i++] = num % 10;
            num /= 10;
        }
        
        Arrays.sort(nums);
        int new1 = nums[0] * 10 + nums[2];
        int new2 = nums[1] * 10 + nums[3];
        
        return new1 + new2;
    }
}
