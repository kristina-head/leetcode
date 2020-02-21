class Solution {
  public int numJewelsInStones(String J, String S) { // O(M + N)
    Set<Character> jewels = new HashSet<>(); // O(1)
    
    for (int i = 0; i < J.length(); i++) { // O(M)
      jewels.add(J.charAt(i)); // O(1)
    }
    
    int count = 0; // O(1)
    for (int k = 0; k < S.length(); k++) { // O(N)
      if (jewels.contains(S.charAt(k))) { // O(1)
        count++;
      }
    }
    
    return count; // O(1)
  }
}
