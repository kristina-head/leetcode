class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        
        for (int num : arr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        if (max - min == 0) return true;
        if ((max - min) % (n - 1) != 0) return false;
        
        int diff = (max - min) / (n - 1);
        Set<Integer> nums = new HashSet<>();

        for (int num : arr) {
            if ((num - min) % diff != 0) return false;
            nums.add(num);
        }

        return nums.size() == n;
    }
}
