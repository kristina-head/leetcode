class Solution {
    public int[] replaceElements(int[] arr) { // O(N)
        int max = -1; // O(1)
        int current; // O(1)
        
        for (int i = arr.length-1; i >= 0; i--) { // O(N)
            current = arr[i]; // O(1)
            arr[i] = max; // O(1)
            max = Math.max(current, max); // O(1)
        }
        
        return arr; // O(1)
    }
}
