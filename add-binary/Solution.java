class Solution {
    public String addBinary(String a, String b) {
        int n = a.length() - 1, m = b.length() - 1;
        if (n < m) return addBinary(b, a);
        
        StringBuilder sum = new StringBuilder();
        int carry = 0;

        while (n >= 0) {
            if (a.charAt(n--) == '1') carry++;
            if (m >= 0 && b.charAt(m--) == '1') carry++;

            char bit = (carry % 2 == 1) ? '1' : '0';
            sum.insert(0, bit);

            carry /= 2;
        }

        if (carry == 1) sum.insert(0, '1');
        
        return sum.toString();
    }
}
