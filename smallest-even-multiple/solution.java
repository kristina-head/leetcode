class Solution {
    public int smallestEvenMultiple(int n) {    
        int multiple = n * 2;
        
        return (n % 2 == 0) ? multiple / 2 : multiple;
    }
}
