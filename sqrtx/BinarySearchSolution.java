class BinarySearchSolution {
    public int mySqrt(int x) { // O(log N)
        if (x < 2) return x; // O(1)
        
        int left = 2, right = x / 2, mid; // O(1)
        long square; // O(1)
        
        while (left <= right) { // O(log N)
            mid = left + (right - left) / 2; // O(1)
            square = (long) mid * mid; // O(1)
            
            if (square == x) { // O(1)
                return mid; // O(1)
            } else if (square < x) { // O(1)
                left = mid + 1; // O(1)
            } else {
                right = mid - 1; // O(1)
            }
        }
        
        return right; // O(1)
    }
}
