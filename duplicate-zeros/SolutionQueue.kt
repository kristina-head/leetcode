class SolutionQueue {
      fun duplicateZeros(arr: IntArray) { 
        val q: Queue<Int> = LinkedList() 
        for (i in arr.indices) { 
            q.add(arr[i]) 
            if (arr[i] == 0) q.add(0) 
            arr[i] = q.remove() 
        }
    }
} 
