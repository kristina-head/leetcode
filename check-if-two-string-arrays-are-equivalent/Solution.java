class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) { // O(N)
        StringBuilder sb1 = new StringBuilder(); // O(1)
        StringBuilder sb2 = new StringBuilder(); // O(1)
        
        for (String s : word1) { // O(N)
            sb1.append(s); // O(1)
        }
        
        for (String s : word2) { // O(N)
            sb2.append(s); // O(1)
        }
        
        return sb1.toString().equals(sb2.toString()); // O(N)
    }
}
