class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int previousMax = 0;
        
        for (int i : nums) {
            if (i >= max) {
                previousMax = max;
                max = i;
            } else if (i >= previousMax) {
                previousMax = i;
            }
        }
        
        return (max-1)*(previousMax-1);
    }
}
