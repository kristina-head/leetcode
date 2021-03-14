class SolutionQueue {
      fun duplicateZeros(arr: IntArray) { // O(N)
        val q: Queue<Int> = LinkedList() // O(1)
        for (i in arr.indices) { // O(N)
            q.add(arr[i]) // O(1)
            if (arr[i] == 0) q.add(0) // O(1)
            arr[i] = q.remove() // O(1)
        }
    }
} 
