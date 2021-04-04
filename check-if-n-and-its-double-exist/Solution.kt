class Solution {
    fun checkIfExist(arr: IntArray): Boolean { // O(N)
        val hashset = hashSetOf<Int>() // O(1)
        
        for (i in arr) { // O(N)
            if (hashset.contains(i * 2) || i % 2 == 0 && hashset.contains(i / 2)) { // O(1)
                return true // O(1)
            }
            hashset.add(i) // O(1)
        }
        
        return false // O(1)
    }
}
