class Solution {
    public double[] convertTemperature(double celsius) { // O(1)
        return new double[] { celsius + 273.15, celsius * 1.80 + 32.00 }; // O(1)
    }
}
