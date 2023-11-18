public class Solution extends GuessGame {
    public int guessNumber(int n) { // O(log N)
        int left = 1, right = n; // O(1)
        
        while (left <= right) { // O(log N)
            int mid = left + (right - left) / 2; // O(1)
            int num = guess(mid); // O(1)
            
            if (num == 1) { // O(1)
                left = mid + 1; // O(1)
            } else if (num == -1) { // O(1)
                right = mid - 1; // O(1)
            } else {
                return mid; // O(1)
            }
        }
        
        return -1; // O(1)
    }
}
