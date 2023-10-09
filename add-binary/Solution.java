class Solution {
    public String addBinary(String a, String b) { // O(N) where N is the longer input String
        int n = a.length() - 1, m = b.length() - 1; // O(1)
        if (n < m) return addBinary(b, a); // O(N)
        
        StringBuilder sum = new StringBuilder(); // O(1)
        int carry = 0; // O(1)

        while (n >= 0) { // O(N)
            if (a.charAt(n--) == '1') carry++; // O(1)
            if (m >= 0 && b.charAt(m--) == '1') carry++; // O(1)

            char bit = (carry % 2 == 1) ? '1' : '0'; // O(1)
            sum.insert(0, bit); // O(1)

            carry /= 2; // O(1)
        }

        if (carry == 1) sum.insert(0, '1'); // O(1)
        
        return sum.toString(); // O(N)
    }
}
