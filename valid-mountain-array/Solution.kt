class Solution {
    fun validMountainArray(arr: IntArray): Boolean { // O(N)
        val n = arr.size // O(1)
        var i = 0 // O(1)
        
        while (i + 1 < n && arr[i] < arr[i + 1]) i++ // N * O(1)
        
        if (i == 0 || i == n - 1) return false // O(1)
        
        while (i + 1 < n && arr[i] > arr[i + 1]) i++ // N * O(1)
        
        return i == n - 1 // O(1)
    }
}
