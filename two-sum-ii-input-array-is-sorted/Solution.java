class Solution {
    public int[] twoSum(int[] numbers, int target) { // O(N)
        int i = 0; // O(1)
        int j = numbers.length - 1; // O(1)
        
        while (i < j) { // O(N)
            int sum = numbers[i] + numbers[j]; // O(1)

            if (sum == target) { // O(1)
                return new int[] { i + 1, j + 1 }; // O(1)
            } else if (sum < target) { // O(1)
                i++; // O(1)
            } else {
                j--; // O(1)
            }
        }
        
        return new int[] { -1, -1 }; // O(1)
    }
}
