public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = guess(mid);
            
            if (num == 1) {
                left = mid + 1;
            } else if (num == -1) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        
        return -1;
    }
}
