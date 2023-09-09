class Solution {
  public int numJewelsInStones(String J, String S) { // O(M + N)
    Set<Character> jewels = new HashSet<>(); // O(1)
    int count = 0; // O(1)
    
    for (char jewel : J.toCharArray()) { // O(M)
      jewels.add(jewel); // O(1)
    }
    
    for (char stone : S.toCharArray()) { // O(N)
      if (jewels.contains(stone)) count++; // O(1)
    }
    
    return count; // O(1)
  }
}
