class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) { // O(N)
        int[] frequency = new int[101]; // O(N)
        int[] smallerNumsCount = new int[101]; // O(N)
        int sum = 0; // O(1)
        
        for (int num : nums) { // O(N)
            frequency[num]++; // O(1)
        }
        
        for (int i = 1; i < 101; i++) { // O(N)
            sum += frequency[i-1]; // O(1)
            smallerNumsCount[i] = sum; // O(1)
        }
        
        for (int i = 0; i < nums.length; i++) { // O(N)
            nums[i] = smallerNumsCount[nums[i]]; // O(1)
        }
        return nums; // O(1)
    }
}
