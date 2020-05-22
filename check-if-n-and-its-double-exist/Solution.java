class Solution {
    public boolean checkIfExist(int[] arr) { // O(N)
        Set<Integer> numbers = new HashSet<>(); // O(1)
        
        for (int i = 0; i < arr.length; i++) { // O(N)
            if (numbers.contains(arr[i] * 2) || (arr[i] % 2 == 0 && numbers.contains(arr[i] / 2))) { // O(1)
                return true; // O(1)
            }
            numbers.add(arr[i]); // O(1)
        }
        
        return false; // O(1)
    }
}
