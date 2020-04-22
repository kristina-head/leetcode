class Solution {
    public boolean uniqueOccurrences(int[] arr) { // O(N + M)
        Map<Integer, Integer> frequency = new HashMap<>(); // O(1)
        
        for (int i = 0; i < arr.length; i++) { // O(N)
            if (frequency.containsKey(arr[i])) { // O(1)
                frequency.put(arr[i], frequency.get(arr[i]) + 1); // O(1)
            } else {
                frequency.put(arr[i], 1); // O(1)
            }
        }
        
        Set<Integer> values = new HashSet<>(frequency.values()); // O(M)
        
        return values.size() == frequency.values().size(); // O(1)
    }
}
