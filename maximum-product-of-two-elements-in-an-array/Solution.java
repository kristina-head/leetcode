class Solution {
    public int maxProduct(int[] nums) { // O(N)
        int max = 0; // O(1)
        int previousMax = 0; // O(1)
        
        for (int i : nums) { // O(N)
            if (i >= max) { // O(1)
                previousMax = max; // O(1)
                max = i; // O(1)
            } else if (i >= previousMax) { // O(1)
                previousMax = i; // O(1)
            }
        }
        
        return (max-1)*(previousMax-1); // O(1)
    }
}
