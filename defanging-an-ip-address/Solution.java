class Solution {
  public String defangIPaddr(String address) { // O(n)
    return address.replace(".", "[.]"); // O(n)
  }
}
