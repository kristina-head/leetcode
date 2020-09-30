class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        
        for (int k = 2; k < arr.length; k++) {
            for (int j = 1; j < k; j++) {
                if (Math.abs(arr[j] - arr[k]) <= b) {
                    for (int i = 0; i < j; i++) {
                        if (Math.abs(arr[i] - arr[j]) <= a && 
                            Math.abs(arr[i] - arr[k]) <= c) {
                            count++;
                        }
                    }
                }
            }
        }
        
        return count;
    }
}
