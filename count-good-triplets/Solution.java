class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) { // O(N^3)
        int count = 0; // O(1)
        
        for (int k = 2; k < arr.length; k++) { // O(N)
            for (int j = 1; j < k; j++) { // O(N)
                if (Math.abs(arr[j] - arr[k]) <= b) { // O(1)
                    for (int i = 0; i < j; i++) { // O(N)
                        if (Math.abs(arr[i] - arr[j]) <= a && 
                            Math.abs(arr[i] - arr[k]) <= c) { // O(1)
                            count++; // O(1)
                        }
                    }
                }
            }
        }
        
        return count; // O(1)
    }
}
