class SolutionImproved {
    public int sumOddLengthSubarrays(int[] arr) { // O(N)
        int total = 0; // O(1)
        int length = arr.length; // O(1)
        
        for (int i = 0; i < length; ++i) { // O(N)
            total += ((i + 1) * (length - i) + 1) / 2 * arr[i]; // O(1)
        }
        
        return total; // O(1)
    }
}

        
