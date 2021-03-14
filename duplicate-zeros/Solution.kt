class Solution {
    fun duplicateZeros(arr: IntArray): Unit { // O(N)
        var i = 0 // O(1)
        while (i < arr.size) { // O(N)
            if (arr[i] == 0) { // O(1)
                for (j in arr.size - 2 downTo i) { // O(N)
                    arr[j + 1] = arr[j] // O(1)
                }
                i++ // O(1)
            }
            i++ // O(1)
        }
    }
}
