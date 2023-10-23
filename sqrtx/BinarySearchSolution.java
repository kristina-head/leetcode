class BinarySearchSolution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        
        int left = 2, right = x / 2, mid;
        long square;
        
        while (left <= right) {
            mid = left + (right - left) / 2;
            square = (long) mid * mid;
            
            if (square == x) {
                return mid;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return right;
    }
}
