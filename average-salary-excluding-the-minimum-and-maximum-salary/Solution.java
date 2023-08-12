class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double total = 0;
        
        for (int amount : salary) {
            min = Math.min(min, amount);
            max = Math.max(max, amount);
            total += amount;
        }

        total -= min + max;
        
        return total / (salary.length - 2);
    }
}
