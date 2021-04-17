class ConciseSolution.java {
    public int[] replaceElements(int[] arr) { // O(N)
        int max = -1; // O(1)
        
        for (int i = arr.length - 1; i >= 0; i--) { // O(N)
            max = Math.max(arr[i], arr[i] = max); // O(1)
        }
        
        return arr; // O(1)
    }
}
