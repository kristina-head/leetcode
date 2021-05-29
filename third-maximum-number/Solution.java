class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        
        for (Integer n : nums) {
            if (n.equals(max) || n.equals(secondMax) || n.equals(thirdMax)) continue;
            if (max == null || n > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = n;
            } else if (secondMax == null || n > secondMax) {
                thirdMax = secondMax;
                secondMax = n;
            } else if (thirdMax == null || n > thirdMax) {
                thirdMax = n;
            }
        }
        
        return thirdMax == null ? max : thirdMax;
    }
}
