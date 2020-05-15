class Solution {
    public void duplicateZeros(int[] arr) { // O(N)
        for (int i = 0; i < arr.length; i++) { // O(N)
            if (arr[i] == 0) { // O(1)
                for (int j = arr.length - 2; j >= i; j--){ // O(N)
                    arr[j + 1] = arr[j]; // O(1)
                }
                i++; // O(1)
            }
        }
    }
}
