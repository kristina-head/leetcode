class Solution {
    fun replaceElements(arr: IntArray): IntArray { // O(N)
        var max = -1 // O(1)
        
        for (i in arr.size-1 downTo 0) { // O(N)
            val current = max // O(1)
            max = Math.max(max, arr[i]) // O(1)
            arr[i] = current // O(1)
        }
        
        return arr // O(1)
    }
}
