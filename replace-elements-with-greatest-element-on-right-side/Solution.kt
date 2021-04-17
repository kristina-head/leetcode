class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var max = -1
        
        for (i in arr.size-1 downTo 0) {
            val current = max
            max = Math.max(max, arr[i])
            arr[i] = current
        }
        
        return arr
    }
}
