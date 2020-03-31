class Solution {
    public int[] decompressRLElist(int[] nums) { // O(M*N)
        int totalFrequency = 0; // O(1)

        for (int i = 0; i < nums.length; i += 2) { // O(M)
            totalFrequency += nums[i]; // O(1)
        }
        
        int[] decompressedList = new int[totalFrequency]; // O(L)
        int index = 0; // O(1)
        
        for (int i = 0; i < nums.length; i += 2) { // O(M*N)
            for (int j = 0; j < nums[i]; j++) { // O(N)
                decompressedList[index] = nums[i + 1]; // O(1)
                index++; // O(1)
            }
        }
        
        return decompressedList; // O(1)
    }
}
