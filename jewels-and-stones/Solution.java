class Solution {
  public int numJewelsInStones(String J, String S) {
    Set<Character> jewels = new HashSet<>();
    
    for (int i = 0; i < J.length(); i++) {
      jewels.add(J.charAt(i));
    }
    
    int count = 0;
    for (int k = 0; k < S.length(); k++) {
      if (jewels.contains(S.charAt(k))) {
        count++;
      }
    }
    
    return count;
  }
}
