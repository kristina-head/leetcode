class Solution {
    public double average(int[] salary) { // O(N)
        int min = Integer.MAX_VALUE; // O(1)
        int max = Integer.MIN_VALUE; // O(1)
        double total = 0; // O(1)
        
        for (int amount : salary) { // O(N)
            min = Math.min(min, amount); // O(1)
            max = Math.max(max, amount); // O(1)
            total += amount; // O(1)
        }

        total -= min + max; // O(1)
        
        return total / (salary.length - 2); // O(1)
    }
}
