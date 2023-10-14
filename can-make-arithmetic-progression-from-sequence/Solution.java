class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) { // O(N)
        int max = Integer.MIN_VALUE; // O(1)
        int min = Integer.MAX_VALUE; // O(1)
        int n = arr.length; // O(1)
        
        for (int num : arr) { // O(N)
            max = Math.max(max, num); // O(1)
            min = Math.min(min, num); // O(1)
        }

        if (max - min == 0) return true; // O(1)
        if ((max - min) % (n - 1) != 0) return false; // O(1)
        
        int diff = (max - min) / (n - 1); // O(1)
        Set<Integer> nums = new HashSet<>(); // O(1)

        for (int num : arr) { // O(N)
            if ((num - min) % diff != 0) return false; // O(1)
            nums.add(num); // O(1)
        }

        return nums.size() == n; // O(1)
    }
}
