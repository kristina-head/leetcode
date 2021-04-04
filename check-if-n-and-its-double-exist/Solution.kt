class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val hashset: HashSet<Int> = HashSet()
        
        for (i in arr) {
            if (hashset.contains(i * 2) || i % 2 == 0 && hashset.contains(i / 2)) {
                return true
            }
            hashset.add(i)
        }
        
        return false
    }
}
