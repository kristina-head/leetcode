class Solution {
    public int maximum69Number(int num) { // O(N)
        LinkedList<Integer> digits = new LinkedList<>(); // O(1)
        
        while (num > 0) { // O(N)
            digits.push(num % 10); // O(1)
            num = num / 10; // O(1)
        }
        
        boolean found = false; // O(1)
        
        while (!digits.isEmpty()) { // O(N)
            int digit = digits.pop(); // O(1)
            if (digit == 6 && !found) { // O(1)
                digit = 9; // O(1)
                found = true; // O(1)
            }
            num = (num * 10) + digit; // O(1)
        }

        return num; // O(1)
    }
}
