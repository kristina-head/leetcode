class Solution {
  public int numberOfSteps(int num) { // O(1)
    int count = 0; // O(1)
    
    while (num != 0) { // O(1)
      count++; // O(1)
      if (num % 2 == 0) { // O(1)
        num /= 2; // O(1)
      } else {
        num -= 1; // O(1)
      }
    }
    return count; // O(1)
  }
}
