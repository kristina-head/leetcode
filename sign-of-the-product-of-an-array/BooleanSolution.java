class BooleanSolution {
    public int arraySign(int[] nums) { // O(N)
        boolean positive = true; // O(1)

        for (int num : nums) { // O(N)
            if (num == 0) return 0; // O(1)
            if (num < 0) positive = !positive; // O(1)
        }

        return positive ? 1 : -1; // O(1)
    }
}
