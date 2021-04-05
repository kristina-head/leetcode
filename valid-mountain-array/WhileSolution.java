class WhileSolution {
    public boolean validMountainArray(int[] arr) { // O(N)
        int n = arr.length; // O(1)
        int i = 0; // O(1)

        while (i + 1 < n && arr[i] < arr[i + 1]) // O(N)
            i++; // O(1)

        if (i == 0 || i == n - 1) // O(1)
            return false; // O(1)

        while (i + 1 < n && arr[i] > arr[i + 1]) // O(N)
            i++; // O(1)

        return i == n - 1; // O(1)
    }
}

