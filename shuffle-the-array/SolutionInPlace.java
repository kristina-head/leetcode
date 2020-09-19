class SolutionInPlace {
    public int[] shuffle(int[] nums, int n) { // O(N*M)
        int temp; // O(1)
        
        for (int i = 1; n < nums.length; i += 2) { // O(M)
            temp = nums[n]; // O(1)
            for (int j = n; j >= i; j--) { // O(N)
                nums[j] = nums[j - 1]; // O(1)
            }
            nums[i] = temp; // O(1)
            n++; // O(1)
        }
        
        return nums; // O(1)
    }
}
