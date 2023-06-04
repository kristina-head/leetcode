class Solution {
    public String removeVowels(String s) { // O(N)
        return s.replaceAll("[aeiou]", ""); // O(N)
    }
}
