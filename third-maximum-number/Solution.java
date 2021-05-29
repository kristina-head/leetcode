class Solution {
    public int thirdMax(int[] nums) { // O(N)
        Integer max = null; // O(1)
        Integer secondMax = null; // O(1)
        Integer thirdMax = null; // O(1)
        
        for (Integer n : nums) { // O(N)
            if (n.equals(max) || n.equals(secondMax) || n.equals(thirdMax)) continue; // O(1)
            if (max == null || n > max) { // O(1)
                thirdMax = secondMax; // O(1)
                secondMax = max; // O(1)
                max = n; // O(1)
            } else if (secondMax == null || n > secondMax) { // O(1)
                thirdMax = secondMax; // O(1)
                secondMax = n; // O(1)
            } else if (thirdMax == null || n > thirdMax) { // O(1)
                thirdMax = n; // O(1)
            }
        }
        
        return thirdMax == null ? max : thirdMax; // O(1)
    }
}
