class Solution {
    public int minimumSum(int num) { // O(N log N)
        int[] nums = new int[4]; // O(N)
        int i = 0; // O(1)
        
        while (num > 0) { // O(N)
            nums[i++] = num % 10; // O(1)
            num /= 10; // O(1)
        }
        
        Arrays.sort(nums); // O(N log N)
        int new1 = nums[0] * 10 + nums[2]; // O(1)
        int new2 = nums[1] * 10 + nums[3]; // O(1)
        
        return new1 + new2; // O(1)
    }
}
